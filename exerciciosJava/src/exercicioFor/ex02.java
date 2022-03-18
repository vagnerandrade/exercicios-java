package exercicioFor;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int somaIN = 0;
		int somaOUT = 0;
		
		for (int i = 1; i<=N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20)
				somaIN = somaIN + 1;
			else somaOUT = somaOUT +1;
		}
		System.out.println(somaIN +  "in");
		System.out.println(somaOUT + "out" );
		
		sc.close();

	}

}
