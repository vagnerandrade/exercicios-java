package exercicios02java;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double renda, imposto = 0.00;
		
		System.out.println("Digite a renda: ");
		renda = sc.nextDouble();
		
		if ( renda >= 0.00 && renda <= 2000.00 ) {
			System.out.println("Isento");
		}else if ( renda >= 2000.01 && renda <= 3000.00 ) {
			imposto = (renda - 2000.0) * 0.08;
			
		}else if ( renda >= 3000.01 && renda <= 4500.00 ) {
			imposto = (renda - 3000.0)  * 0.18 + 1000.0 * 0.08;
			
		}else if ( renda >4500.00 ) {
			imposto = (renda - 4500.0) * 0.28 + 1500.0 *0.18 + 1000.0 * 0.08;
		}
		
		System.out.println("R$ "+ imposto);
		
		sc.close();
	}

}
