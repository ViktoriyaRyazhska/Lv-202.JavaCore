package hw9;

import java.util.Scanner;

public class dilennya {
	private double a;
	private double b;

	public dilennya(double a, double b) {

		this.a = a;
		this.b = b;
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

	

	@Override
	public String toString() {
		return "dilennya [a=" + a + ", b=" + b + "]";
	}

	public double div() throws Exception {
		if ((a<=0)||(b<=0)) throw new Exception("Error!!!!(((");
		double D;
		return D = a / b;
	}
	
}
