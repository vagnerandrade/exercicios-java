package exercicioFor;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt();
		double a, b, c, media;
		
		for (int i = 1; i<= N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
		media = (a * 0.2) + (b * 0.3) + (c * 0.5); 
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}
