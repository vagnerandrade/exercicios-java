package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("digite a altura do retangulo:");
		x.a = sc.nextDouble();
		
		System.out.println("digite a base do retangulo");
		x.b = sc.nextDouble();
		
		double areaR= x.area();
		double periR = x.perimetro();
		double diaR = x.diagonal();
		
		System.out.printf("Area = %.2f%n", areaR);
		System.out.printf("Perimetro = %.2f%n", periR);
		System.out.printf("Diagonal = %.2f%n", diaR);
		
		sc.close();
	}

}
