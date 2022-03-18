package exercicios01Java;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num, Hr;
		double Shr, salario;
		
		System.out.println("digite o numero do usuario:");
		Num = sc.nextInt();
		System.out.println("Digite as horas trabalhadas:");
		Hr = sc.nextInt();
		System.out.println("digite o Valor da hora trabalhada:");
		Shr = sc.nextDouble();
		
		salario = Shr * Hr;
		
		System.out.println("numero: " + Num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		
		
		
		sc.close();
	}

}
