package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) {
		// Create - Insertar registros (INSERT)
		Connection con = null;
		PreparedStatement ps = null;
		String query = "INSERT INTO ALUMNO VALUES (?, ?, ?, ?, ?, ?, ?)";
		// Para hacer una inserción, slo indicamos con los signos de ? las columnas a insertarse
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maringah", "admin");
			ps = con.prepareStatement(query);
			
			// Establecemos los valotres para crear nuestro nuevo registro
			ps.setInt(1, 1); // Se inserta el ID y lo hace el disparador
			ps.setString(2, "MARIA GUADALUPE");
			ps.setString(3, "12/12/2004");
			ps.setString(4, "FEMENINO");
			ps.setString(5, "2ER SEMESTRE");
			ps.setString(6, "VERACRUZ");
			ps.setInt(7, 1);
			
			// Una vez establecemos los valores ejecutamos el INSERT
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("Alumno guardado exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
