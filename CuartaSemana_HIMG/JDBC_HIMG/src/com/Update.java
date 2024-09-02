package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		// Update - Actualizar registros de una tabla
		Connection con = null;
		PreparedStatement ps = null;
		String query = "UPDATE ALUMNO SET NOMBRE = ?, FECHANAC = ?, "
				+ "GENERO = ?, GRADO = ?, CIUDAD = ? "
				+ "WHERE ALUMNO_ID = ?";
		// Para hacer una inserción, slo indicamos con los signos de ? las columnas a insertarse
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maringah", "admin");
			ps = con.prepareStatement(query);
			
			// Establecemos los valotres para actualizar nuestro registro 
			// pero las columnas van indicadas en el orden que aparecen en la sentencia
			
			ps.setString(1, "CRUZ");
			ps.setString(2, "12/11/2004");
			ps.setString(3, "MASCULINO");
			ps.setString(4, "1ER SEMESTRE");
			ps.setString(5, "PEROTE");
			ps.setInt(6, 24); // El ID se envia al final como en la sentencia se indica.
			
			// Una vez establecemos los valores ejecutamos el UPDATE
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("Alumno editado exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
