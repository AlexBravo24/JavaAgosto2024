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


import com.dao.ProcuradoresDAO;
import com.entity.Procuradores;
import com.general.Status;

@Path("procuradores")
//http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/procuradores/mostrar
public class ProcuradoresService {
	
	Procuradores procurador = null;
	ProcuradoresDAO dao = null;
	
	// Los verbos HTTP sirven para indicar la accion de la petición pero no la limita
		// La logica del método
		// Ej. puedo guardar un elemento aunque indique un verbo @DELETE sin embargo no es lo recomendado.
		@Path("mostrar")
		@GET
		@Produces({MediaType.APPLICATION_JSON})
		public List<Procuradores> mostrar(){
			dao = new ProcuradoresDAO();
			List<Procuradores> list = dao.mostrar();
			System.out.println("datos: " + list);
			return list;
		}
		
		
		@Path("guardar")
		@POST
		@Consumes({MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_JSON})
		// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/procuradores/guardar
		public Status guardar(Procuradores p) {
			System.out.println("procurador a guardar " + p);
			Status state = new Status();
			state.setOb(p);
			
			dao = new ProcuradoresDAO();
			String res = dao.guardar(p);
			
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
		@DELETE // Verbo correcto para eliminar un recurso.
		@Produces({MediaType.APPLICATION_JSON})
		// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/procuradores/eliminar/id
		public Status eliminar(@PathParam("id")int id) {
			Status state = new Status();
			state.setOb(id);
			
			dao = new ProcuradoresDAO();
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
		@PUT // Verbo correcto para la edicion de un elemento o recurso.
		@Consumes({MediaType.APPLICATION_JSON})
		@Produces({MediaType.APPLICATION_JSON})
		// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/procuradores/editar
		public Status editar(Procuradores p) {
			Status state = new Status();
			state.setOb(p);
			
			dao = new ProcuradoresDAO();
			String res = dao.editar(p);
			
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
		// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/procuradores/buscar-por-id/id
		public Procuradores buscar(@PathParam("id")int id) {
			dao = new ProcuradoresDAO();
			procurador = (Procuradores)dao.buscar(id);
			System.out.println("Se encontro el registro");
			
			return procurador;
		}

}
