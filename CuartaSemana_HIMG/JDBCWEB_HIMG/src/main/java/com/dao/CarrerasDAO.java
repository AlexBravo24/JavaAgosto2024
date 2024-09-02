package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.entity.Carreras;
import com.general.Database;
import com.general.IMetodos;

public class CarrerasDAO implements IMetodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	Database db = new Database();

	Carreras c = null;

	String resultado = null;

	@Override
	public String guardar(Object ob) {
		c = (Carreras) ob;

		String query = "INSERT INTO CARRERAS VALUES (?, ?, ?, ?, ?)";

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			ps.setInt(1, 1);
			ps.setString(2, c.getNombre());
			ps.setString(3, c.getArea());
			ps.setString(4, c.getDuracion());
			ps.setDouble(5, c.getPresupuesto());

			int flag = ps.executeUpdate();

			if (flag == 1) {
				resultado = "1"; // Como debemos responder con un String a traves de este metodo
				// le cambiamos el valor a la variable resultado
				System.out.println("Se ha guardado correctamente la carrera");
			} else {
				resultado = "0";
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			resultado = e.getMessage();
		}
		return resultado;
	}

	@Override
	public String editar(Object ob) {
		c = (Carreras) ob;
		String query = "UPDATE CARRERAS SET NOMBRE = ?, AREA = ?, DURACION = ?, PRESUPUESTO = ? WHERE CARRERA_ID = ?";

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);

			// Establecemos los valores de nuestra carrera a editar

			ps.setString(1, c.getNombre());
			ps.setString(2, c.getArea());
			ps.setString(3, c.getDuracion());
			ps.setDouble(4, c.getPresupuesto());
			ps.setInt(5, c.getCarreraId());
			

			int flag = ps.executeUpdate(); // Ejecutamos la sentencia sql y si se realiza
			// devuelve un numero entero

			// Validamos
			if (flag == 1) {
				resultado = "1"; // Como debemos responder con un String a traves de este metodo
				// le cambiamos el valor a la variable resultado
				System.out.println("Se ha editado correctamente la carrera");
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
		String query = "DELETE FROM CARRERAS WHERE CARRERA_ID = " + id;

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
		String query = "SELECT * FROM CARRERAS WHERE CARRERA_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery(); // Recuerden que la info del objeto de la base de datos
			// se guarda provisionalmente en rs.

			while (rs.next()) {
				// Guardamos la info en un nuevo Alumno a
				c = new Carreras (rs.getInt(1), rs.getNString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}

		} catch (Exception e) {
			// Aqui como ya no podemos regresar la variable resultado
			// mandamos a imprimir en consola el error.
			e.printStackTrace();
		}

		return c;
		
	}

	@Override
	public List mostrar() {
		
		String query = "SELECT * FROM CARRERAS"; 
		// Declaramos una lista de alumnos para agregar a cada una a dicha lista
		List<Carreras> carreras = new ArrayList<Carreras>();

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery(); // Recuerden que la info del objeto de la base de datos
			// se guarda provisionalmente en rs.
			
			while(rs.next()) {
				// Guardamos la info en un nuevo Alumno a
				c = new Carreras (rs.getInt(1), rs.getNString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
				carreras.add(c);
			}


		} catch (Exception e) {
			// Aqui como ya no podemos regresar la variable resultado 
			// mandamos a imprimir en consola el error.
			e.printStackTrace();
		}

		return carreras;
	}

}
