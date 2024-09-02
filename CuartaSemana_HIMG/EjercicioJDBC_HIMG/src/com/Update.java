package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		// Update - Actualizar registros de una tabla
		Connection con = null;
		PreparedStatement ps = null;
		String query = "UPDATE CARRERAS SET NOMBRE = ?, AREA = ?, " + "DURACION = ?, PRESUPUESTO = ? "
				+ "WHERE CARRERA_ID = ?";
		// Para hacer una inserción, lo indicamos con los signos de ? las columnas a
		// insertarse

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maringah", "admin");
			ps = con.prepareStatement(query);

			// Establecemos los valotres para actualizar nuestro registro
			// pero las columnas van indicadas en el orden que aparecen en la sentencia

			ps.setString(1, "ARQUITECTURA");
			ps.setString(2, "DISEÑO");
			ps.setString(3, "8 SEMESTRES");
			ps.setDouble(4, 23999.99);
			ps.setInt(5, 4); // El ID se envia al final como en la sentencia se indica.

			// Una vez establecemos los valores ejecutamos el UPDATE
			int flag = ps.executeUpdate();

			if (flag == 1) {
				System.out.println("Carrera editada exitosamente");
			} else {
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
