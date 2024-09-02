package com.ms_clientes.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms_clientes.entity.Clientes;
import com.ms_clientes.repository.ClientesRepository;
import com.ms_clientes.request.ClientesRequest;
import com.ms_clientes.service.ClientesService;




@Service
public class ClientesLogic implements ClientesService {
	
	@Autowired
	ClientesRepository dao;

	@Override
	public Clientes guardar(ClientesRequest request) {
		// Instanciamos un objeto Alumno que se guardara en la base de datos
		Clientes cliente = new Clientes();
		// Establecemos o asignamos sus valoresa a guardar
		// que recibimos desde el frente en AlumnoRequest
		cliente.setNombre(request.getNombre());
		cliente.setDireccion(request.getDireccion());
		cliente.setTelefono(request.getTelefono());
		

		// Ya que tenemos los valores asignados guardamos al alumno en la BD
		dao.save(cliente);
		return cliente; // Devolvemos la info guardada hacia el frente.
	}

	@Override
	public Clientes editar(ClientesRequest request) {
		// Encontramos atraves del id del Alumno a editar en la BD
		Clientes cliente = dao.findById(request.getClienteId()).get();
		// Establecemos o asignamos sus valoresa a editar o actualizar
		// que recibimos desde el frente en AlumnoRequest
		cliente.setNombre(request.getNombre());
		cliente.setDireccion(request.getDireccion());
		cliente.setTelefono(request.getTelefono());
		
		

		// Ya que tenemos los valores actualizados guardamos al alumno en la BD
		dao.save(cliente);
		
		return cliente; // Devolvemos la info guardada hacia el frente.

	}

	@Override
	public Clientes buscar(int id) {
		return dao.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);
		return "Registro eliminado correctamente";
	}

	@Override
	public List<Clientes> mostrar() {
		return dao.findAll();
	}
}
