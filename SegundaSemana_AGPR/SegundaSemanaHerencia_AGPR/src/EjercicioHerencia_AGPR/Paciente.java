package EjercicioHerencia_AGPR;

public class Paciente extends Persona {
	
	private String tipoSangre;
	private String diaIngreso;
	private String cuartoAsignado;
	private String diagnostico;
	
	public Paciente () {}

	public Paciente(String nombre, int edad, String genero, String tipoSangre, String diaIngreso, String cuartoAsignado,
			String diagnostico) {
		super(nombre, edad, genero);
		this.tipoSangre = tipoSangre;
		this.diaIngreso = diaIngreso;
		this.cuartoAsignado = cuartoAsignado;
		this.diagnostico = diagnostico;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getDiaIngreso() {
		return diaIngreso;
	}

	public void setDiaIngreso(String diaIngreso) {
		this.diaIngreso = diaIngreso;
	}

	public String getCuartoAsignado() {
		return cuartoAsignado;
	}

	public void setCuartoAsignado(String cuartoAsignado) {
		this.cuartoAsignado = cuartoAsignado;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "Paciente [tipoSangre=" + tipoSangre + ", diaIngreso=" + diaIngreso + ", cuartoAsignado="
				+ cuartoAsignado + ", diagnostico=" + diagnostico + ", toString()=" + super.toString() + "]";
	}
	
	

}
