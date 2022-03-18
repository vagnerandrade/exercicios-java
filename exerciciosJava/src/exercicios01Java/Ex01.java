package exercicios01Java;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;

		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;

	System.out.println(soma);
	
	sc.close();
	}

}
