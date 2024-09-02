package com.general;

import java.util.List;

public interface IMetodos {
	// Aqui declaramos los métodos u operaciones que la clase
	// de la lógica o implementación tendrá que resolver
	// (DAO)
	public String guardar(Object ob);
	public String editar(Object ob);
	public String eliminar(int id);
	public Object buscar(int id);
	public List mostrar();
	
	

}
