package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {
		// Create - Insertar registros (INSERT)
		Connection con = null;
		PreparedStatement ps = null;
		String query = "INSERT INTO CARRERAS VALUES (?, ?, ?, ?, ?)";
		// Para hacer una inserción, sOlo indicamos con los signos de ? las columnas a
		// insertarse

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maringah", "admin");
			ps = con.prepareStatement(query);

			// Establecemos los valores para crear nuestro nuevo registro
			ps.setInt(1, 1); // Se inserta el ID y lo hace el disparador
			ps.setString(2, "DESARROLLO SOFTWARE");
			ps.setString(3, "C.EXACTAS");
			ps.setString(4, "10 SEMESTRES");
			ps.setDouble(5, 23999.99);
			

			// Una vez establecemos los valores ejecutamos el INSERT
			int flag = ps.executeUpdate();

			if (flag == 1) {
				System.out.println("Carrera guardada exitosamente");
			} else {
				System.out.println("Hubo un error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
