package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Digite o nome do empregado: ");
		employee.nome = sc.nextLine();
		System.out.println("digite o salario bruto: ");
		employee.salarioBruto = sc.nextDouble();
		System.out.println("digite a taxa: ");
		employee.taxa = sc.nextDouble();
		
		System.out.println("empregado: " + employee.nome + ", $"+ employee.salarioLiq());
		
		System.out.println("Qual a porcentagem de aumento?: ");
		employee.Porcent = sc.nextDouble();
	
		System.out.println("empregado: " + employee.nome + ", $"+ employee.newSalario());
		
		
		
		
		sc.close();
	}

}
