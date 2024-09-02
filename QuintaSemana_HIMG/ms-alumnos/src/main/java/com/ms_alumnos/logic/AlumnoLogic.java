package com.ms_alumnos.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ms_alumnos.entity.Alumno;
import com.ms_alumnos.exception.NoSePuedeEditarException;
import com.ms_alumnos.repository.AlumnoRepository;
import com.ms_alumnos.request.AlumnoRequest;
import com.ms_alumnos.service.AlumnoService;

// @Service // Anotación que marca la clase de la implementación
// ¿Que ocurre si en lugar de una anotación @Service utilizo una @Component en una clase 
// de logica o implementación
// ¿Se lleva a cabo la inyeccion de la clase?
// Si. Si funciona la inyección de la clase porque @Service deriva de @Component
@Component // Esta anotación se utiliza para marcar clases u objetos que Spring tiene que 
// gestionar
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
		
		// Vamos a modificar este metodo en el que unicamente se nos permita 
		// editar o actualizar la info de los alumnos, siempre y cuando esten activos
		// es decir tengan estatus 1
		if (alumno.getStatus() == 1) {
		
		alumno.setNombre(request.getNombre());
		alumno.setFechaNac(request.getFechaNac());
		alumno.setGenero(request.getGenero());
		alumno.setGrado(request.getGrado());
		alumno.setCiudad(request.getCiudad());

		// Ya que tenemos los valores actualizados guardamos al alumno en la BD
		dao.save(alumno);
		}else {
			// System.out.println("No se pueden actualizar los datos del alumno");
			// Vamos a arrojar una excepcion personalizada que envie un msj
			// adecuado. Para ello vamos a tener que crear la clase de la excepción.
			throw new NoSePuedeEditarException("Nos se puede editar al alumno");
		}
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

	// Recuerden que tenemos que crear métodos propios
	// además de los que implementamos de alguna interface

	public List<Alumno> femenino() {
		// Almacenamos primero a todos los alumnos de aqui de la lista de la BD
		List<Alumno> lista = dao.findAll();

		// Declaramos otra lista en donde vamos a filtrar la info
		List<Alumno> femenino = new ArrayList<Alumno>();

		// Aplicamos el uso de API Stream para filtrar unicamente a los
		// alumnos de genero femenino
		femenino = lista.stream().filter(a -> a.getGenero().equals("FEMENINO")).collect(Collectors.toList());

		return femenino;
	}

	// Podemos crear métodos especificos para un proposito, por ejemplo
	// en el metodo editar no tenemos la posibilidad de editar o actualizar el
	// estatus
	// del alumno, pero podemos crear un método que nos permita establecer su
	// estatus en "0"
	// para poder darlo de "baja".
	public String inactivar(int id) {
		// Primero lo encontramos en la BD
		Alumno alumno = dao.findById(id).get();

		// Le establecemos su estatus en 0
		alumno.setStatus(0);
		dao.save(alumno);
		return "Alumno dado de baja exitosamente";

	}

}
