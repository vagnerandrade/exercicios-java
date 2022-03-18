package entiities;

public class Conta {
	private String nome;
	private int numero;
	private double deposito;
	private double taxa = 5.00;
	
	public Conta (String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public Conta (String nome, int numero, double depositoInicial) {
		this.nome = nome;
		this.numero = numero;
		addDeposito(depositoInicial);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void addDeposito(double deposito) {
		this.deposito += deposito;
	}
	
	public void removeDeposito(double deposito) {
		this.deposito -= deposito;
		this.deposito -= taxa;
	}
	
	public String toString() {
		return "Conta: " 
			+ numero
			+ ", Titular: "
			+ nome
			+ ", Balanço: R$ "
			+ String.format("%.2f", deposito);
	}
		
}
