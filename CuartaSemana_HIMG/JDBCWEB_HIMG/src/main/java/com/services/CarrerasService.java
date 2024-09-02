package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.dao.CarrerasDAO;

import com.entity.Carreras;
import com.general.Status;

@Path("carreras")
public class CarrerasService {
	
	CarrerasDAO dao = null;
	
	@GET // VERBO HTTP PARA RECUPERAR RECURSOS (CONSULTAS)
	@Path("mostrar") // path o ruta de la URL del método.
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/carreras/mostrar
	
	public List<Carreras>mostrar() {
		// Iniciamos el objeto dao
		dao = new CarrerasDAO();
		
		return dao.mostrar(); // Devolvemos la lista hacia el frente o web
		
	}
	
	@GET
	@Path("buscar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/carreras/buscar/id
	
	public Carreras buscar(@PathParam ("id") int id) {
		dao = new CarrerasDAO();
		return (Carreras) dao.buscar(id);
	}
	
	
	@POST // VERBO HTTP PARA PUBLICAR O GUARDAR NUEVOS RECURSOS
	@Path("guardar")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/carreras/guardar
	
	public Status guardar (Carreras c) {
		// Vamos a devolver un objeto Status, asi que iniciamos uno vacío
		Status s = new Status();
		
		s.setOb(c); // Indicamos la info del alumno que se envía a la BD
		// Iniciamos el dao
		dao = new CarrerasDAO();
		// Guardamos la respuesta del método guardar el DAO
		String response = dao.guardar(c);
		
		// Validamos la respuesta de los Strings del objeto Status
		if (response.equals("1")) {
			s.setMensaje("Carrera guardada exitosamente");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	@PUT // VERBO HTTP PARA ACTUALIZAR RECURSOS
	@Path("editar")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) // Indicamos que consumiremos 
	// info en formato JSON
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/carreras/editar
	public Status editar (Carreras c) {
		// Vamos a devolver un objeto Status, asi que iniciamos uno vacío
		Status s = new Status();
		
		s.setOb(c); 
		
		dao = new CarrerasDAO();
		// Guardamos la respuesta del método guardar el DAO
		String response = dao.editar(c);
		
		// Validamos la respuesta de los Strings del objeto Status
		if (response.equals("1")) {
			s.setMensaje("Carrera editada exitosamente");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	
	@DELETE // VERBO HTTP PARA ELIMINAR RECURSOS
	@Path("eliminar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	// info en formato JSON
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/carreras/eliminar/id
	public Status eliminar (@PathParam ("id") int id) {
		// Vamos a devolver un objeto Status, asi que iniciamos uno vacío
		Status s = new Status();
		
		s.setOb(id); 
		
		dao = new CarrerasDAO();
		// Guardamos la respuesta del método guardar el DAO
		String response = dao.eliminar(id);
		
		// Validamos la respuesta de los Strings del objeto Status
		if (response.equals("1")) {
			s.setMensaje("Carrera eliminada exitosamente");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}

}
