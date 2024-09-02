package com.ms_alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms_alumnos.entity.Alumno;

// @Repository
// ¿Si quito la anotación @Repository el proyecto sigue funcionando?
// SI
// ¿Por que?
// Por que Jpa Repository esta heredando de una interface principal llamada Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> { 
	
	// Estereotipos de Spring 
	// Basicamente son 4: @Component, @Repository, @Service, @Controller
	
	// Asi queda nuestra interface para realizar operaciones basicas CRUD
	// Y si necesitaramos algo más especifico se declara aqui en 
	// un pseudo lenguaje llamado JPQL o HQL
	

}
