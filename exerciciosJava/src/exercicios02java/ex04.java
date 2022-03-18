package exercicios02java;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int hrInicial, hrFinal, dura;
		
		System.out.println("Digite o hora inicial do jogo:" );
		hrInicial = sc.nextInt();
		
		System.out.println("Digite o hora final do jogo:" );
		hrFinal = sc.nextInt();
		
		if  (hrInicial < hrFinal) {
			dura = hrInicial - hrFinal;
		}else {
			dura = 24 - hrInicial + hrFinal;
		}
		
		System.out.println("O JOGO DUROU " + dura +  " HORAS(S)");
		sc.close();

	}

}
