package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.ObjetoDTO;
import com.entity.Alumno;
import com.general.Database;
import com.general.IMetodos;

public class AlumnoDAO implements IMetodos {
	// DAO - (Data Access Object - Lógica/Transformación
	// de la información)
	// Esta clase deberá implementar la interface u operaciones
	// por resolver.

	// Declaramos a las interfaces que utilizaremos en los métodos
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	// Necesitamos un objeto de la clase Database para recuperar
	// la info de la conexión a base de datos.
	Database db = new Database();

	// Instanciamos un objeto Alumno nulo, para poder manipularlo
	// después
	Alumno a = null;

	// Declaramos un String llamado resultado para comunicar más
	// adelante con la clase ce paquete service si la opearción
	// se realizó o no.
	String resultado = null;

	@Override
	public String guardar(Object ob) {
		// Casteamos el valor que el objeto que recibeeste método como argumento
		// en realidad es un alumno
		a = (Alumno) ob;

		// Declaramos nuestro query para hacer la inserción en la BD
		String query = "INSERT INTO ALUMNO VALUES (?, ?, ?, ?, ?, ?, ?)";

		// Intentamos hacer la conexión a la BD
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			// Establecemos los valores de nuestro alumno a guardar
			ps.setInt(1, 1);
			ps.setString(2, a.getNombre());
			ps.setDate(3, a.getFechaNac());
			ps.setString(4, a.getGenero());
			ps.setString(5, a.getGrado());
			ps.setString(6, a.getCiudad());
			ps.setInt(7, 1); // Cada vez que guardemos un alumno se guarda con estatus 1.

			int flag = ps.executeUpdate(); // Ejecutamos la sentencia sql y si se realiza
			// devuelve un numero entero

			// Validamos
			if (flag == 1) {
				resultado = "1"; // Como debemos responder con un String a traves de este metodo
				// le cambiamos el valor a la variable resultado
				System.out.println("Se ha guardado un nuevo alumno");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			// Si hay una excepción el mensaje de la misma lo guardamos en el String
			// resultado
			resultado = e.getMessage();
		}

		return resultado;
	}

	@Override
	public String editar(Object ob) {
		a = (Alumno) ob;
		String query = "UPDATE ALUMNO SET NOMBRE = ?, FECHANAC = ?, GENERO = ?, GRADO = ?, "
				+ "CIUDAD = ? WHERE ALUMNO_ID = ?";

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			// Establecemos los valores de nuestro alumno a editar

			ps.setString(1, a.getNombre());
			ps.setDate(2, a.getFechaNac());
			ps.setString(3, a.getGenero());
			ps.setString(4, a.getGrado());
			ps.setString(5, a.getCiudad());
			ps.setInt(6, a.getAlumnoId());

			int flag = ps.executeUpdate(); // Ejecutamos la sentencia sql y si se realiza
			// devuelve un numero entero

			// Validamos
			if (flag == 1) {
				resultado = "1"; // Como debemos responder con un String a traves de este metodo
				// le cambiamos el valor a la variable resultado
				System.out.println("Se ha editado correctamente al alumno");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			// Si hay una excepción el mensaje de la misma lo guardamos en el String
			// resultado
			resultado = e.getMessage();
		}

		return resultado;
	}

	@Override
	public String eliminar(int id) {
		// La sentencia SQL para eliminar un registro se completara con el id
		// que solicita el método
		String query = "DELETE FROM ALUMNO WHERE ALUMNO_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			int flag = ps.executeUpdate(); // Ejecutamos la sentencia SQL y si se realiza
			// devuelve un numero entero

			// Validamos
			if (flag == 1) {
				resultado = "1"; // Como debemos responder con un String a traves de este metodo
				// le cambiamos el valor a la variable resultado
				System.out.println("Se ha eliminado correctamente al alumno");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			// Si hay una excepción el mensaje de la misma lo guardamos en el String
			// resultado
			resultado = e.getMessage();
		}

		return resultado;
	}

	@Override
	public Object buscar(int id) {
		// Aqui esta sentencia solo recupera un registro de un alumno
		String query = "SELECT * FROM ALUMNO WHERE ALUMNO_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery(); // Recuerden que la info del objeto de la base de datos
			// se guarda provisionalmente en rs.
			
			while(rs.next()) {
				// Guardamos la info en un nuevo Alumno a
				a = new Alumno(rs.getInt(1), rs.getNString(2), rs.getDate(3), 
						rs.getString(4), rs.getNString(5), rs.getString(6), rs.getInt(7));
			}


		} catch (Exception e) {
			// Aqui como ya no podemos regresar la variable resultado 
			// mandamos a imprimir en consola el error.
			e.printStackTrace();
		}

		return a;
	}

	@Override
	public List mostrar() {
		// Este metodo es similar al anterior solo que cada alumno lo debemos agregar 
		// a una lista
		
		String query = "SELECT * FROM ALUMNO"; 
		// Declaramos una lista de alumnos para agregar a cada una a dicha lista
		List<Alumno> alumnos = new ArrayList<Alumno>();

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery(); // Recuerden que la info del objeto de la base de datos
			// se guarda provisionalmente en rs.
			
			while(rs.next()) {
				// Guardamos la info en un nuevo Alumno a
				a = new Alumno(rs.getInt(1), rs.getNString(2), rs.getDate(3), 
						rs.getString(4), rs.getNString(5), rs.getString(6), rs.getInt(7));
				alumnos.add(a);
			}


		} catch (Exception e) {
			// Aqui como ya no podemos regresar la variable resultado 
			// mandamos a imprimir en consola el error.
			e.printStackTrace();
		}

		return alumnos;
	}
	
	// Método para consulta DTO
	public List detalles () {
		String query = "SELECT A.ALUMNO_ID AS MATRICULA, A.NOMBRE AS ALUMNO, C.NOMBRE AS CARRERA, C.AREA FROM ALUMNO A " + 
				"INNER JOIN CARRERAS_ALUMNOS CA " + 
				"ON A.ALUMNO_ID=CA.ALUMNO_ID " + 
				"INNER JOIN CARRERAS C " + 
				"ON C.CARRERA_ID=CA.CARRERA_ID";
		
		// Necesitamos declarar un objeto de la clase ObjetoDTO y una lista para ir agregando
		// cada registro
		
		ObjetoDTO fila = null;
		
		List<ObjetoDTO> detalles = new ArrayList<ObjetoDTO>();
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery(); // Recuerden que la info del objeto de la base de datos
			// se guarda provisionalmente en rs.
			
			while(rs.next()) {
				// Guardamos la info de la consulta de los detalles del alumno (ObjetoDTO)
				fila = new ObjetoDTO(rs.getInt("MATRICULA"), rs.getString("ALUMNO"), rs.getString("CARRERA"), rs.getString("AREA"));
				detalles.add(fila);
			}


		} catch (Exception e) {
			// Aqui como ya no podemos regresar la variable resultado 
			// mandamos a imprimir en consola el error.
			e.printStackTrace();
		}

		return detalles;
		
		
		
	}

}
