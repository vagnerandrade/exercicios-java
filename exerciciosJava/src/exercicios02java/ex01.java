package exercicios02java;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.printf("Digite o valor:\n");
		x = sc.nextInt();
		
		if(x >=0 ) {
			System.out.printf("valor positivo");
		}
		else {
			System.out.printf("valor negativo");	
		}
		
	sc.close();
	}
}
