package EjercicioComposicion_AGPR;

public class Cuidado {
	
	private String riego;
	private String luzsombra;
	private String fertilizacion;
	
	public Cuidado () {}

	public Cuidado(String riego, String luzsombra, String fertilizacion) {
		super();
		this.riego = riego;
		this.luzsombra = luzsombra;
		this.fertilizacion = fertilizacion;
	}

	public String getRiego() {
		return riego;
	}

	public void setRiego(String riego) {
		this.riego = riego;
	}

	public String getLuzsombra() {
		return luzsombra;
	}

	public void setLuzsombra(String luzsombra) {
		this.luzsombra = luzsombra;
	}

	public String getFertilizacion() {
		return fertilizacion;
	}

	public void setFertilizacion(String fertilizacion) {
		this.fertilizacion = fertilizacion;
	}

	@Override
	public String toString() {
		return "Cuidado [riego=" + riego + ", luzsombra=" + luzsombra + ", fertilizacion=" + fertilizacion + "]";
	}
	
	

}
