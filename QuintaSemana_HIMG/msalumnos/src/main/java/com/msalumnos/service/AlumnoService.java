package com.msalumnos.service;

import java.util.List;

import com.persistence.entity.Alumno;
import com.persistence.request.AlumnoRequest;



public interface AlumnoService {
	
	// Estos son los metodos de la clase de la implementación 
	// tendra que resolver
	// Son acciones particulares del negocio donde desarrollamos
	
	public Alumno guardar(AlumnoRequest request);
	public Alumno editar(AlumnoRequest request);
	public Alumno buscar(int id);
	public String eliminar(int id);
	public List<Alumno>mostrar();

}