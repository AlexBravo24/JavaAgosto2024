package com.ms_clientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms_clientes.entity.Clientes;
import com.ms_clientes.logic.ClientesLogic;
import com.ms_clientes.request.ClientesRequest;



@RestController
@RequestMapping("clientes")
public class ClientesController {
	
	@Autowired
	ClientesLogic service;
	
	@GetMapping("mostrar")
	// http://localhost:8095/clientes/mostrar
	public ResponseEntity <List<Clientes>>mostrar(){
		// Declaramos una lista que recupera la info de los alumnos
		List<Clientes> lista = service.mostrar();
		
		return new ResponseEntity<List<Clientes>>(lista, HttpStatus.OK);
		
	}
	
	
	@PostMapping("guardar")
	// http://localhost:8095/clientes/guardar
	public ResponseEntity<Clientes> guardar (@RequestBody ClientesRequest request){
		Clientes cliente = service.guardar(request);
		return new ResponseEntity<Clientes>(cliente, HttpStatus.OK);
	}
	
	
	@PutMapping("editar")
	// http://localhost:8095/clientes/editar
	public ResponseEntity<Clientes> editar (@RequestBody ClientesRequest request){
		Clientes cliente = service.editar(request);
		return new ResponseEntity<Clientes>(cliente, HttpStatus.OK);
	}
	
	
	@GetMapping("buscar/{id}")
	// http://localhost:8095/clientes/buscar/id
	public ResponseEntity<Clientes> buscar (@PathVariable int id){
		Clientes cliente = service.buscar(id);
		return new ResponseEntity<Clientes>(cliente, HttpStatus.OK);
	}
	
	
	@DeleteMapping("eliminar/{id}")
	// http://localhost:8095/cliente/eliminar/id
	public ResponseEntity<String> eliminar (@PathVariable int id){
		String cliente = service.eliminar(id);
		return new ResponseEntity<String>(cliente, HttpStatus.OK);
	}

}
