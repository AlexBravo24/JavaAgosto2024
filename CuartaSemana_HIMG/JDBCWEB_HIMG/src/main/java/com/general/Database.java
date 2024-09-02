package com.general;

public class Database {
	// En esta clase vamos a encapsular la información de la conexión 
	// a la BD
	// Para estar recuperando dicha información a traves de un objeto de esta clase.
	
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String usuario = "maringah";
	private String password = "admin";
	
	// Generamos un constructor con todos los argumentos pero los quitamos 
	// para poder recuperar a traves de los getters la info ya almacenada
	// en esta clase.
	public Database() {
		super();
		this.driver = driver;
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Database [driver=" + driver + ", url=" + url + ", usuario=" + usuario + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
