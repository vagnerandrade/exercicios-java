package entities;

public class Retangulo {

	public double a;
	public double b;
	
	public double area() {
		double p = a * b;
		return p;
	}
	
	public double perimetro() {
		double x = (a + b) * 2 ;
		return x;
	}
	
	public double diagonal() {
		double x = (a*a) + (b* b);
		double d = Math.sqrt(x);
		return d;
	}

}
