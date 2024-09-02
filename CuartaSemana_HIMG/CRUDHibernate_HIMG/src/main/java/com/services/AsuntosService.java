package com.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.AsuntosDAO;
import com.entity.Asuntos;

@Path("asuntos")
public class AsuntosService {
	
	Asuntos asunto = null;
	AsuntosDAO dao = null;
	
	@Path("mostrar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	// http://localhost:8085/CRUDHibernate_HIMG/CRUDHibernate_HIMG/asuntos/mostrar
	public List<Asuntos>mostrar(){
		dao = new AsuntosDAO();
		return dao.mostrar();
	}
	

}
