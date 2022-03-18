package exercicioFor;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for (int i = 1; i<=N; i++) {
			int a = i * i;
			int b = i * i *i;
			System.out.print(i + " " );
			System.out.print(a + " ");
			System.out.println(b);
		}
		
		sc.close();
	}

}
