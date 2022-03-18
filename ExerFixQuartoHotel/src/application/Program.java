package application;

import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vect = new Quartos[10];
		
		System.out.println("quantos estudantes iram alugar os quartos? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome =  sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Quartos(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Quatos ocupados");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i +": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
