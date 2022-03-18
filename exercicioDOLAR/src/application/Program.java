package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dolar");
		double dolar = sc.nextDouble();
		System.out.println("Digite o valor a ser comprado");
		int quantidade = sc.nextInt();
		
		double a = CurrencyConverter.convercao(dolar, quantidade);
		
		System.out.printf("Quantidade a ser paga: %.2f%n", a);
		
		
		sc.close();
	}

}
