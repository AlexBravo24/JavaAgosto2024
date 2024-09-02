package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Asuntos;
import com.general.Metodos;

public class AsuntosDAO implements Metodos {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	// Carga todas las operaciones (insert, update, delete, select, contar, ect)
	EntityManager em = emf.createEntityManager();

	Asuntos asunto = null;

	@Override
	public String guardar(Object ob) {
		asunto = (Asuntos) ob;
		em.getTransaction().begin();
		String resultado = null;

		try {
			em.persist(asunto); // Este es el insert
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");

		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close();
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		asunto = (Asuntos) ob;
		Asuntos asuntodb = em.find(Asuntos.class, asunto.getAsuntoId());
		String resultado = null;

		try {
			asuntodb.setNombre(asunto.getNombre());
			asuntodb.setFechaFin(asunto.getFechaFin());
			asuntodb.setEstado(asunto.getEstado());
			asuntodb.setCliente(asunto.getCliente());

			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Editado Correctamente");

		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No se pudo editar");
		}
		em.close();
		return resultado;
	}

	@Override
	public String eliminar(int id) {
		asunto = em.find(Asuntos.class, asunto.getAsuntoId());
		em.getTransaction().begin();
		String resultado = null;

		try {
			em.remove(asunto);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			resultado = "1";

		} catch (Exception e) {
			em.getTransaction().rollback(); // Si el registro no puede realizarse, se instruye un rollback.
			resultado = e.getMessage();
			System.out.println("No pudo eliminarse el registro");

		}
		em.close();
		// Hasta este método eliminar se puede aun cerrar
		// EntityManager para ahorrar memoria
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		
		asunto = em.find(Asuntos.class, id);
		
		return asunto;
	}

	@Override
	public List mostrar() {
		List<Asuntos> lista = em.createQuery("from Asuntos").getResultList();
		return lista;
	}

}
