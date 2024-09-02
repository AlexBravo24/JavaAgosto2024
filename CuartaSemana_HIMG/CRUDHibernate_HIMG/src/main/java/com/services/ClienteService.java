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

import com.dao.ClienteDAO;
import com.entity.Clientes;
import com.general.Status;

@Path("clientes")
// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/clientes/mostrar

public class ClienteService {
	
	Clientes cliente = null;
	ClienteDAO dao = null;
	
	// Los verbos HTTP sirven para indicar la accion de la petición pero no la limita
	// La logica del método
	// Ej. puedo guardar un elemento aunque indique un verbo @DELETE sin embargo no es lo recomendado.
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Clientes> mostrar(){
		dao = new ClienteDAO();
		List<Clientes> list = dao.mostrar();
		System.out.println("datos: " + list);
		return list;
	}
	
	
	@Path("guardar")
	// @GET
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/clientes/guardar
	public Status guardar(Clientes c) {
		System.out.println("cliente a guardar " + c);
		Status state = new Status();
		state.setOb(c);
		
		dao = new ClienteDAO();
		String res = dao.guardar(c);
		
		if(res.equals("1")) {
			state.setMensaje("Guardado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible guardar");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("eliminar/{id}")
	//@GET
	@DELETE // Verbo correcto para eliminar un recurso.
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/clientes/eliminar/id
	public Status eliminar(@PathParam("id")int id) {
		Status state = new Status();
		state.setOb(id);
		
		dao = new ClienteDAO();
		String res = dao.eliminar(id);
		
		if(res.equals("1")) {
			state.setMensaje("Eliminado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible eliminar este registro");
			state.setRespuesta(res);
		}
		return state;
		
	}
	
	
	@Path("editar")
	//@GET
	@PUT // Verbo correcto para la edicion de un elemento o recurso.
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/clientes/editar
	public Status editar(Clientes c) {
		Status state = new Status();
		state.setOb(c);
		
		dao = new ClienteDAO();
		String res = dao.editar(c);
		
		if(res.equals("1")) {
			state.setMensaje("Actualizado exitosamente");
			state.setRespuesta(res);
		}else {
			state.setMensaje("No fue posible actualizar este registro");
			state.setRespuesta(res);
		}
		return state;
	}
	
	@Path("buscar-por-id/{id}")
	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/clientes/buscar-por-id/id
	public Clientes buscar(@PathParam("id")int id) {
		dao = new ClienteDAO();
		cliente = (Clientes)dao.buscar(id);
		System.out.println("Se encontro el registro");
		
		return cliente;
	}

}
