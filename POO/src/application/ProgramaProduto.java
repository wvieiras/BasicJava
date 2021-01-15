package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produto[] produto = new Produto[n];
		
		for(int i=0;i<n;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			Double preco = sc.nextDouble();
			
			produto[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i = 0;i < n; i++) {
			soma += produto[i].getPreco();
		}
		
		double media = soma / produto.length;
		
		System.out.printf("A média dos produtos é: %.2f", media);
		sc.close();
	}

}
