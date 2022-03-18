package exercciosEstruturaRepeticao;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, somaA = 0,somaB = 0 ,somaD = 0;		
		
		System.out.println("digite 1 para alcool \n 2 para diesel \n 3 para gasolina \n 4 para finalizar");
		a = sc.nextInt();
		
		while ( a != 4) {
			if (a == 1 ) {
				somaA = somaA + 1;
				System.out.println("alcool: " + somaA);
			}else if (a == 2 ) {
				somaB = somaB + 1;
				System.out.println("diesel: " + somaB);
			}else if (a == 3 ) {
				somaD = somaD + 1;
				System.out.println("gasolina: " + somaD);
			}
			a = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		
		sc.close();
	}

}
