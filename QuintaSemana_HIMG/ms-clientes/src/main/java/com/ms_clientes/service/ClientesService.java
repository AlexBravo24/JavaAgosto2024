package com.ms_clientes.service;

import java.util.List;

import com.ms_clientes.entity.Clientes;
import com.ms_clientes.request.ClientesRequest;



public interface ClientesService {
	
	public Clientes guardar(ClientesRequest request);
	public Clientes editar(ClientesRequest request);
	public Clientes buscar(int id);
	public String eliminar(int id);
	public List<Clientes>mostrar();


}
