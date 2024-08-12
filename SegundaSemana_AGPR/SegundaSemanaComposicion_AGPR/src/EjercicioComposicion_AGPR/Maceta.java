package EjercicioComposicion_AGPR;

public class Maceta {
	
	private String material;
	private int precio;
	private String tamaño;
	
	public Maceta () {}

	public Maceta(String material, int precio, String tamaño) {
		super();
		this.material = material;
		this.precio = precio;
		this.tamaño = tamaño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Maceta [material=" + material + ", precio=" + precio + ", tamaño=" + tamaño + "]";
	}
	
	

}
