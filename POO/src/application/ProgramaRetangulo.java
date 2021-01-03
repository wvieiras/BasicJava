package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a altura e a largura do retângulo:");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		System.out.printf("Area = %.2f %n", retangulo.area());
		System.out.printf("Perimetro = %.2f %n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f", retangulo.diagonal());
		
		sc.close();

	}

}
