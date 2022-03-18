package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("digite o nome do aluno");
		aluno.nome = sc.nextLine();
		System.out.println("digite a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("digite a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("digite a terceira nota: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("nota Final: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("falta %.2f pontos%n", aluno.pontosfaltantes());
			
		}else {
			System.out.println("PASSOU");
		}
		sc.close();
	}
}
