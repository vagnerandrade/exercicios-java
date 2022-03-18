package exercicioFor;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a, b;
		double divi;
		
		for (int i = 1; i<=N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if ( b == 0) {
			System.out.println("divisao impossivel");
			}else {
			divi = (double) a / b;
			System.out.printf("%.1f%n", divi);
			}
		}
		
		sc.close();
	}

}
