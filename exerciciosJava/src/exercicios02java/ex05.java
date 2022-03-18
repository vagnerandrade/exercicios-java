package exercicios02java;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		double preco = 0;
		
		System.out.println("digite o codigo do item desejado");
		cod = sc.nextInt();
		
		System.out.println("digite a quantidade do item desejado");
		qtd = sc.nextInt();
		
		if (cod == 1) {
			preco = qtd * 4.0;
			
		}else if (cod == 2) {
			preco = qtd * 4.5;
			
		}else if (cod == 3) {
			preco = qtd * 5.0;
			
		}else if (cod == 4) {
			preco = qtd * 2.0;
			
		}else if (cod == 5) {
			preco = qtd * 1.5;
			
		}else {
			System.out.println("codigo invalido");
		}
		
		System.out.printf("Total: R$ %.2f%n", preco);
		
		sc.close();

	}

}
