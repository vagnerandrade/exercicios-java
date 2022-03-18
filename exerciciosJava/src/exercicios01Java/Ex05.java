package exercicios01Java;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod1, cod2, pc1, pc2;
		double valorpc1, valorpc2, total;

		// peca 1
		System.out.println("Digite o codigo da peça 1:");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças:");
		pc1 = sc.nextInt();
		System.out.println("Digite o valor da peca 1:");
		valorpc1 = sc.nextDouble();

		// peca 2
		System.out.println("Digite o codigo da peça 2:");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças:");
		pc2 = sc.nextInt();
		System.out.println("Digite o valor da peca 2:");
		valorpc2 = sc.nextDouble();

		total = (pc1 * valorpc1) + (pc2 * valorpc2);

		System.out.printf("VALOR A PAGAR : R$%.2f%n", total);

		sc.close();
	}

}
