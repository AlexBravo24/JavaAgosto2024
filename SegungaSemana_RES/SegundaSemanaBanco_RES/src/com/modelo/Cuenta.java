package com.modelo;

public class Cuenta {
	//En el paquete com.modelo guardamos la información
	// de los modelos o entidades a los cuales queremos acceder
	//En este ejemplo necesitamos crear varias cuentas
	//de usuarios y los agregaremos para simular
	//una pequeña BD
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saldomax;
	private String tipoCuenta;
	public Cuenta() {}
	public Cuenta(String usuario, double saldo, double saldoMin, double saldomax, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldomax = saldomax;
		this.tipoCuenta = tipoCuenta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldoMin() {
		return saldoMin;
	}
	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}
	public double getSaldomax() {
		return saldomax;
	}
	public void setSaldomax(double saldomax) {
		this.saldomax = saldomax;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldomax=" + saldomax
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	

}
