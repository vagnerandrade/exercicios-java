package entities;

public class Employee {
	
	public String nome;
	public Double salarioBruto;
	public Double taxa;
	public Double Porcent;
	
	
	public double salarioLiq() {
		double salarioLiqd = salarioBruto - taxa;
		return salarioLiqd;
	} 
	
	public double newSalario() {
		double x = salarioBruto * 0.10;
		double c = x + salarioLiq();
		return c;
	}
	
	
	
}
