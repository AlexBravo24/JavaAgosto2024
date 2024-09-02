package com.ms_alumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms_alumnos.entity.Alumno;
import com.ms_alumnos.logic.AlumnoLogic;
import com.ms_alumnos.request.AlumnoRequest;

@RestController
@RequestMapping("alumno")
public class AlumnoController {
	
	// Inyectamos un objeto de la clase AlumnoLogic
	
	@Autowired
	AlumnoLogic service;
	
	// Spring Framework puede responder a traves de ResponseEntity
	// que es un objeto que responde con la info de la BD 
	// Y detalles en caso de una excepcion como hora, tipo
	// de excepción ect.
	
	@GetMapping("mostrar")
	// http://localhost:8090/alumno/mostrar
	public ResponseEntity <List<Alumno>>mostrar(){
		// Declaramos una lista que recupera la info de los alumnos
		List<Alumno> lista = service.mostrar();
		
		return new ResponseEntity<List<Alumno>>(lista, HttpStatus.OK);
		
	}
	
	/**
	 * Este metodo requiere como parametro
	 * @param la info en JSON del alumno a guardar que llega a un objeto AlumnoRequest
	 * @return un Alumno entity de la base de datos con ID asignado
	 */
	
	@PostMapping("guardar")
	// http://localhost:8090/alumno/guardar
	public ResponseEntity<Alumno> guardar (@RequestBody AlumnoRequest request){
		Alumno alumno = service.guardar(request);
		return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
	}
	
	
	@PutMapping("editar")
	// http://localhost:8090/alumno/editar
	public ResponseEntity<Alumno> editar (@RequestBody AlumnoRequest request){
		Alumno alumno = service.editar(request);
		return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
	}
	
	
	@GetMapping("buscar/{id}")
	// http://localhost:8090/alumno/buscar/id
	public ResponseEntity<Alumno> buscar (@PathVariable int id){
		Alumno alumno = service.buscar(id);
		return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
	}
	
	
	@DeleteMapping("eliminar/{id}")
	// http://localhost:8090/alumno/eliminar/id
	public ResponseEntity<String> eliminar (@PathVariable int id){
		String alumno = service.eliminar(id);
		return new ResponseEntity<String>(alumno, HttpStatus.OK);
	}
	
	@GetMapping("mostrarFemenino")
	// http://localhost:8090/alumno/mostrarFemenino
	public ResponseEntity <List<Alumno>>femenino(){
		// Declaramos una lista que recupera la info de los alumnos
		List<Alumno> lista = service.femenino();
		
		return new ResponseEntity<List<Alumno>>(lista, HttpStatus.OK);
	}
	
	@PatchMapping("inactivar/{id}")
	// Verbo Patch = Se utiliza para actualización parcial de un recurso
	// http://localhost:8090/alumno/inactivar/id
	public ResponseEntity<String>inactivar (@PathVariable int id){
		String alumno = service.inactivar(id);
		return new ResponseEntity<String>(alumno, HttpStatus.OK);
	}


	
	

}
