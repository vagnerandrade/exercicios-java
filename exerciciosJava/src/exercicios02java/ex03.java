package exercicios02java;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0 ) {
			System.out.println("Sao multiplus");

		} else {
			System.out.println("Nao sao multiplus");

		}


		sc.close();
	}

}
