package EjercicioComposicion_AGPR;

public class Maceta {
	
	private String material;
	private int precio;
	private String tama�o;
	
	public Maceta () {}

	public Maceta(String material, int precio, String tama�o) {
		super();
		this.material = material;
		this.precio = precio;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Maceta [material=" + material + ", precio=" + precio + ", tama�o=" + tama�o + "]";
	}
	
	

}
