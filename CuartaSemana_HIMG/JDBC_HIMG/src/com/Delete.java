package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		// Delete - El borrado de un registro
		Connection con = null;
		PreparedStatement ps = null;
		String query = "DELETE FROM ALUMNO WHERE ALUMNO_ID = ?";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "maringah", "admin");
			ps = con.prepareStatement(query);
			
			// Unicamente mandamos la info del ID a eliminar
			
			ps.setInt(1, 25); // El ID se envia al final como en la sentencia se indica.
			
			// Una vez establecemos los valores ejecutamos el DELETE
			int flag = ps.executeUpdate();
			
			if (flag == 1) {
				System.out.println("Alumno borrado exitosamente");
			}else {
				System.out.println("Hubo un error");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
