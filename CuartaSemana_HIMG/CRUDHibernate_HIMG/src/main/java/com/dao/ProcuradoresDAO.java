package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.entity.Procuradores;
import com.general.Metodos;

public class ProcuradoresDAO implements Metodos {

	// Carga los objetos (las clases definidas en el persistence)
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tables");
	// Carga todas las operaciones (insert, update, delete, select, contar, ect)
	EntityManager em = emf.createEntityManager();
	Procuradores procurador = null;

	@Override
	public String guardar(Object ob) {

		procurador = (Procuradores) ob;
		em.getTransaction().begin();
		String resultado = null;

		try {
			em.persist(procurador); // Este es el insert
			em.getTransaction().commit();
			resultado = "1";
			System.out.println("Registro insertado");

		} catch (Exception e) {
			em.getTransaction().rollback();
			resultado = e.getMessage();
			System.out.println("No pudo insertarse");
		}
		em.close(); // Es importante cerrar el EntityManager para liberar memoria
		return resultado;
	}

	@Override
	public String editar(Object ob) {

		procurador = (Procuradores) ob;
		Procuradores procuradordb = em.find(Procuradores.class, procurador.getClienteId());
		String r = null;
		em.getTransaction().begin();

		try {
			procuradordb.setNombre(procurador.getNombre());
			procuradordb.setDireccion(procurador.getDireccion());
			procuradordb.setTelefono(procurador.getTelefono());
			procuradordb.setHonorarios(procurador.getHonorarios());
			em.getTransaction().commit();
			System.out.println("Editado correctamente");
			r = "1";

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo editar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public String eliminar(int id) {

		String r = null;
		procurador = em.find(Procuradores.class, id);
		em.getTransaction().begin();

		try {
			em.remove(procurador);
			em.getTransaction().commit();
			System.out.println("Se ha eliminado el registro");
			r = "1";

		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("No se pudo eliminar");
			r = e.getMessage();
		}
		return r;
	}

	@Override
	public Object buscar(int id) {

		procurador = em.find(Procuradores.class, id);
		return procurador;
	}

	@Override
	public List mostrar() {
		List<Procuradores> ls = em.createQuery("from Procuradores").getResultList();
		return ls;
	}

}
