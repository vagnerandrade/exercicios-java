package matriz2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		//isntanciação da matriz
		int [][] mat = new int[m][n];
		
		// laço de repetição da matriz
		for (int i=0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		// mostar a matriz completa
		/*		
		for (int i=0; i<mat.length; i++) {
			System.out.println();
			for (int j = 0; j<mat[i].length; j++) {
				System.out.print(mat [i][j] + " ");
			}
		}*/
		
		//valor de x
		int x = sc.nextInt();
		
		// mostrar valores acima, laterais e abaixo de X
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++)
				if(mat[i][j] == x ){
					System.out.println("Position: " + i + "," + j + ":");
					if (j>0) {
						System.out.println("left: " + mat[i][j-1]);
					}
					if (i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j<mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i<mat.length - 1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
				}
		}
		
		sc.close();

	}

}
