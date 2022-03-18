package exercicios02java;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite o numero desejado:");
		x = sc.nextInt();
		
		
		
		if(x % 2 == 0) {
			System.out.println("numero é par");
		} else {
			System.out.println("numero é Impar");
		}
			
		
		sc.close();

	}

}
