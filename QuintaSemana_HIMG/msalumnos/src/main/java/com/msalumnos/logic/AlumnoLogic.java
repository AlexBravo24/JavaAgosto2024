package com.msalumnos.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.entity.Alumno;
import com.persistence.repository.AlumnoRepository;
import com.persistence.request.AlumnoRequest;
import com.msalumnos.service.AlumnoService;

@Service // Anotación que marca la clase de la implementación
public class AlumnoLogic implements AlumnoService {

	// Necitamos la interface que se encaarga del acceso a datos
	// (DAO)
	@Autowired // Inyección de dependencias
	// Gestiona los tiempos o momentos en los que se inicia
	// un objeto o interface para utilizar sus métodos.
	AlumnoRepository dao;

	@Override
	public Alumno guardar(AlumnoRequest request) {
		// Instanciamos un objeto Alumno que se guardara en la base de datos
		Alumno alumno = new Alumno();
		// Establecemos o asignamos sus valoresa a guardar
		// que recibimos desde el frente en AlumnoRequest
		alumno.setNombre(request.getNombre());
		alumno.setFechaNac(request.getFechaNac());
		alumno.setGenero(request.getGenero());
		alumno.setGrado(request.getGrado());
		alumno.setCiudad(request.getCiudad());
		alumno.setStatus(1);

		// Ya que tenemos los valores asignados guardamos al alumno en la BD
		dao.save(alumno);
		return alumno; // Devolvemos la info guardada hacia el frente.
	}

	@Override
	public Alumno editar(AlumnoRequest request) {
		// Encontramos atraves del id del Alumno a editar en la BD
		Alumno alumno = dao.findById(request.getAlumnoId()).get();
		// Establecemos o asignamos sus valoresa a editar o actualizar
		// que recibimos desde el frente en AlumnoRequest
		alumno.setNombre(request.getNombre());
		alumno.setFechaNac(request.getFechaNac());
		alumno.setGenero(request.getGenero());
		alumno.setGrado(request.getGrado());
		alumno.setCiudad(request.getCiudad());

		// Ya que tenemos los valores actualizados guardamos al alumno en la BD
		dao.save(alumno);

		return alumno; // Devolvemos la info guardada hacia el frente.

	}

	@Override
	public Alumno buscar(int id) {
		return dao.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);
		return "Registro eliminado correctamente";
	}

	@Override
	public List<Alumno> mostrar() {
		return dao.findAll();
	}

	
	
}
