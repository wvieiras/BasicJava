package application;

import java.util.Scanner;

import entities.Conta;

public class ProgramaConta {

	public static void main(String[] args) {
		
		char deposit = ' ';
		Conta cliente1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n): ");
		deposit = sc.next().charAt(0);
		
		if(deposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			cliente1 = new Conta(number,name,value);
		} else {
			cliente1 = new Conta(number,name);
		}
		
		System.out.println("Account data: ");
		System.out.println(cliente1.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		cliente1.depositar(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(cliente1.toString());
		
		System.out.print("Enter a withdraw value: ");
		cliente1.retirar(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(cliente1.toString());
		
		sc.close();
	}

}
