package application;

import java.util.Scanner;

import entiities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;

		
		System.out.print("digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Haverá deposito inicia (s/n)?");
		char response = sc.next().charAt(0);
		if ( response == 's') {
		System.out.println("digite o valor do deposito: ");
		 double deposito = sc.nextDouble();
		 conta = new Conta(nome, numero, deposito);
		}else {
			conta = new Conta(nome, numero);
		}
		
		System.out.println();
		System.out.println("Dados da conta " + conta);
		
		System.out.println();
		System.out.print("digite o valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.addDeposito(deposito);
		
		System.out.println();
		System.out.println("Dados da conta " + conta);
		
		System.out.println();
		System.out.println("digite o valor a ser retirado: ");
		deposito = sc.nextDouble();
		conta.removeDeposito(deposito);
		
		System.out.println();
		System.out.println("Dados da conta " + conta);
		
		sc.close();		
	}

}
