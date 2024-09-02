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

import com.dao.AlumnoDAO;
import com.dto.ObjetoDTO;
import com.entity.Alumno;
import com.general.Status;

@Path("alumnos") // Marcamos la clase con una ruta que formara parte de la URL de
// este proyecto.
public class AlumnoService {
	
	// Esta clase es la que ofrece la comunicación web
	// Expone la funcionalidad del backend
	// Más adelante esta clase la conoceremos como controlador
	
	// Aqui definimos a traves de los metodos y la clase en si
	// los endpoints o URL para realizar las peticiones
	
	// Necesitamos instanciar un objeto de AlumnoDAO para poder utilizar
	// su lógica o métodos y recuperar o manipular la info de la BD
	
	AlumnoDAO dao = null;
	
	// Comenzamos a declarar las anotaciones para la ejeción de cada
	// método
	@GET // VERBO HTTP PARA RECUPERAR RECURSOS (CONSULTAS)
	@Path("mostrar") // path o ruta de la URL del método.
	@Produces({MediaType.APPLICATION_JSON}) // Indicamos que la info que sale de la base de datos 
	// se producira o mostrará en formato JSON.
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/alumnos/mostrar
	public List<Alumno>mostrar() {
		// Iniciamos el objeto dao
		dao = new AlumnoDAO();
		
		return dao.mostrar(); // Devolvemos la lista hacia el frente o web
		
	}

	@GET
	@Path("buscar/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/alumnos/buscar/id
	// Con la anotación @PathParam indicamos un alias para especificar que
	// el argumento que espera este método lo vamos a enviar a traves del path
	// o endpoint (URL)
	public Alumno buscar(@PathParam ("id") int id) {
		dao = new AlumnoDAO();
		return (Alumno) dao.buscar(id);
	}
	
	@POST // VERBO HTTP PARA PUBLICAR O GUARDAR NUEVOS RECURSOS
	@Path("guardar")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON}) // Indicamos que consumiremos 
	// info en formato JSON
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/alumnos/guardar
	public Status guardar (Alumno a) {
		// Vamos a devolver un objeto Status, asi que iniciamos uno vacío
		Status s = new Status();
		
		s.setOb(a); // Indicamos la info del alumno que se envía a la BD
		// Iniciamos el dao
		dao = new AlumnoDAO();
		// Guardamos la respuesta del método guardar el DAO
		String response = dao.guardar(a);
		
		// Validamos la respuesta de los Strings del objeto Status
		if (response.equals("1")) {
			s.setMensaje("Alumno guardado exitosamente");
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
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/alumnos/editar
	public Status editar (Alumno a) {
		// Vamos a devolver un objeto Status, asi que iniciamos uno vacío
		Status s = new Status();
		
		s.setOb(a); 
		
		dao = new AlumnoDAO();
		// Guardamos la respuesta del método guardar el DAO
		String response = dao.editar(a);
		
		// Validamos la respuesta de los Strings del objeto Status
		if (response.equals("1")) {
			s.setMensaje("Alumno editado exitosamente");
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
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/alumnos/eliminar/id
	public Status eliminar (@PathParam ("id") int id) {
		// Vamos a devolver un objeto Status, asi que iniciamos uno vacío
		Status s = new Status();
		
		s.setOb(id); 
		
		dao = new AlumnoDAO();
		// Guardamos la respuesta del método guardar el DAO
		String response = dao.eliminar(id);
		
		// Validamos la respuesta de los Strings del objeto Status
		if (response.equals("1")) {
			s.setMensaje("Alumno eliminado exitosamente");
			s.setRespuesta(response);
		}else {
			s.setMensaje("Error");
			s.setRespuesta(response);
		}
		return s;
	}
	
	@GET
	@Path("detalles")
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/JDBCWEB_HIMG/JDBCWEB_HIMG/alumnos/detalles
	public List<ObjetoDTO> detalles () {
		dao = new AlumnoDAO();
		return dao.detalles();
	}
	
	
	
	
}
