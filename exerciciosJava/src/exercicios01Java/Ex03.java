package exercicios01Java;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, X;

		System.out.println("Digite os numeros desejados:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		X = A * B - C * D;

		System.out.println("Diferença:" + X);

		sc.close();
	}

}
