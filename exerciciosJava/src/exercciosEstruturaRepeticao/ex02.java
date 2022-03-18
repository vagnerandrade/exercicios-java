package exercciosEstruturaRepeticao;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while( X != 0 && Y != 0 ) {
			
			if ( X > 0 && Y > 0 ) {
			System.out.println("primeiro\n");
		}else if ( X > 0 && Y <= -1 ) {
			System.out.println("quarto\n");
		}else if ( X <= -1 && Y > 0 ) {
			System.out.println("segundo\n");
		}
		else if ( X <= -1 && Y <=-1 ) {
			System.out.println("terceiro\n");
		}
			
			X = sc.nextInt();
			Y = sc.nextInt();
			
		}
		
		sc.close();
	}

}
