package com;

public abstract class Calculadora_RES {
	         protected double a;
	         protected double b;
	         protected double c;
	         protected double r;
	         public Calculadora_RES() {}
			public Calculadora_RES(double a, double b, double c, double r) {
				this.a = a;
				this.b = b;
				this.c = c;
				this.r = r;
			}
			public double getA() {
				return a;
			}
			public void setA(double a) {
				this.a = a;
			}
			public double getB() {
				return b;
			}
			public void setB(double b) {
				this.b = b;
			}
			public double getC() {
				return c;
			}
			public void setC(double c) {
				this.c = c;
			}
			public double getR() {
				return r;
			}
			public void setR(double r) {
				this.r = r;
			}
			public abstract void suma(double a, double b);
			public abstract void suma(double a, double b, double c);
            public abstract void resta(double a,double b);
            public abstract void multiplicacion(double a, double b);
            public abstract void division(double a, double b);
}
