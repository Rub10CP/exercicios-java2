package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		employee emp = new employee();
		
		System.out.println(" Digite o nome: ");
		emp.name = sc.nextLine();
		System.out.println(" Digite o salario: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println(" Digite a taxa: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("O valor do employee é " + emp);
		System.out.println();
		System.out.println("Digite a porcentagem do salario: ");
		double porcentage = sc.nextDouble();
		emp.increaseSalary(porcentage);
		
		System.out.println();
		System.out.println(" O novo salario é: " + emp);
		sc.close();

	}

}
