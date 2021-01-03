package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Dados " + funcionario.toString());
		System.out.println();
		System.out.print("Digite a porcentagem de aumento do salário bruto: ");
		double incremento = sc.nextDouble();
		funcionario.incrementoSalario(incremento);
		
		System.out.println();
		System.out.println("Salario atual " + funcionario.toString());
		
		sc.close();
	}

}
