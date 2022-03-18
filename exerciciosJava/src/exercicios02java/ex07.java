package exercicios02java;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double Y, X;
		
		System.out.println("digite as cordenada X: ");
		X = sc.nextDouble();
		
		System.out.println("digite as cordenada Y: ");
		Y = sc.nextDouble();
		
		if (X == 0 && Y == 0) {
			System.out.println("Origem");
		}else if ( X > 0 && Y > 0 ) {
			System.out.println("Q1");
		}else if ( X > 0 && Y <= -1 ) {
			System.out.println("Q4");
		}else if ( X <= -1 && Y > 0 ) {
			System.out.println("Q2");
		}
		else if ( X <= -1 && Y <=-1 ) {
			System.out.println("Q3");
		}
		sc.close();

	}

}
