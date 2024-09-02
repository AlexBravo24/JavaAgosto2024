package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> { 
	
	// Estereotipos de Spring 
	// Basicamente son 4: @Component, @Repository, @Service, @Controller
	
	// Asi queda nuestra interface para realizar operaciones basicas CRUD
	// Y si necesitaramos algo más especifico se declara aqui en 
	// un pseudo lenguaje llamado JPQL o HQL
	

}
