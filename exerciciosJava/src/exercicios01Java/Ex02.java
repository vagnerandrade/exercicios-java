package exercicios01Java;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pi, r, area;

		pi = 3.14159;
		r = sc.nextDouble();
		area = pi * Math.pow(r, 2.0);

		System.out.println("Área =" + area);

		sc.close();
	}

}
