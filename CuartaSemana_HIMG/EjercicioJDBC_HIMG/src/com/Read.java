package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {

	public static void main(String[] args) {
		// READ- JDBC - Consultar datos
		// Consultar nuestra tabla CARRERAS

		Connection con = null; // Conexión a la BD
		PreparedStatement ps = null; // Entrada de datos a traves de una
		// sentencia SQL precompilada
		ResultSet rs = null; // Salida de datos
		String query = "SELECT * FROM CARRERAS ORDER BY CARRERA_ID";

		try { // intentar ejecutar el siguiente bloque de codigo
				// Buscamos le clase OracleDriver dentro de un paquete pkg
			Class.forName("oracle.jdbc.OracleDriver");
			// Inicializamos nuestra conexión a BD.
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maringah", "admin");
			// Pasamos el valor de la conexión a BD a ps
			// al igual que la consulta
			ps = con.prepareStatement(query); // Se precompila la sentencia SQL.
			rs = ps.executeQuery(); // Se ejecuta y se recupera la info de BD.

			while (rs.next()) { // Mientras existan registros por leer
				System.out.println(rs.getInt("CARRERA_ID") + " : " + rs.getString("NOMBRE") + " : "
						+ rs.getString("AREA") + " : " + rs.getString("DURACION") + " : " 
						+ rs.getInt("PRESUPUESTO"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
