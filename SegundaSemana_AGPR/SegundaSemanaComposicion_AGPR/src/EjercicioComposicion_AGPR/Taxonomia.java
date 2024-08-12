package EjercicioComposicion_AGPR;

public class Taxonomia {
	
	private String division;
	private String clase;
	
	public Taxonomia () {}

	public Taxonomia(String division, String clase) {
		super();
		this.division = division;
		this.clase = clase;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Taxonomia [division=" + division + ", clase=" + clase + "]";
	}
	
	

}
