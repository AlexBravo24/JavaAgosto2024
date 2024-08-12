package EjercicioComposicion_AGPR;

public class ArregloFloral {
	
	private String flor;
	private String tierra;
	private String precio;
	private Taxonomia taxonomia;
	private Maceta maceta;
	private Cuidado cuidado;
	
	public ArregloFloral () {}

	public ArregloFloral(String flor, String tierra, String precio, Taxonomia taxonomia, Maceta maceta,
			Cuidado cuidado) {
		super();
		this.flor = flor;
		this.tierra = tierra;
		this.precio = precio;
		this.taxonomia = taxonomia;
		this.maceta = maceta;
		this.cuidado = cuidado;
	}

	public String getFlor() {
		return flor;
	}

	public void setFlor(String flor) {
		this.flor = flor;
	}

	public String getTierra() {
		return tierra;
	}

	public void setTierra(String tierra) {
		this.tierra = tierra;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Taxonomia getTaxonomia() {
		return taxonomia;
	}

	public void setTaxonomia(Taxonomia taxonomia) {
		this.taxonomia = taxonomia;
	}

	public Maceta getMaceta() {
		return maceta;
	}

	public void setMaceta(Maceta maceta) {
		this.maceta = maceta;
	}

	public Cuidado getCuidado() {
		return cuidado;
	}

	public void setCuidado(Cuidado cuidado) {
		this.cuidado = cuidado;
	}

	@Override
	public String toString() {
		return "ArregloFloral [flor=" + flor + ", tierra=" + tierra + ", precio=" + precio + ", taxonomia=" + taxonomia
				+ ", maceta=" + maceta + ", cuidado=" + cuidado + "]";
	}
	
	
	

}
