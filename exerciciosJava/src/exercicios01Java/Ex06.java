package exercicios01Java;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b,c ,pi, 
		totalTri, totalCir, totalTra, totalQua, totalRet;
		
		pi= 3.14159;
		
		System.out.println("Digite o primeiro valor");
		a = sc.nextDouble();
		System.out.println("Digite o segundo valor");
		b = sc.nextDouble();
		System.out.println("Digite o terceiro valor");
		c = sc.nextDouble();
		
		
		totalTri = (a*c) / 2;
		totalCir = pi*(c*c);
		totalTra = ((a + b) * c) / 2;
		totalQua = b*b;
		totalRet = a*b;
		
		System.out.printf("Triangulo: %.3f%n", totalTri);
		System.out.printf("Circulo: %.3f%n", totalCir);
		System.out.printf("Trapezio: %.3f%n", totalTra);
		System.out.printf("Quadrado: %.3f%n", totalQua);
		System.out.printf("Retangulo: %.3f%n", totalRet);
		
		sc.close();
		
		
		
	}

}
