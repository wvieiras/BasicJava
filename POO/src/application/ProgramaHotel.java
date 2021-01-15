package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class ProgramaHotel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Qual número de quartos deseja arrendar: ");
		int n = sc.nextInt();
		
		Hotel[] hotel = new Hotel[10];
		
		System.out.println();
		for(int i=0;i<n;i++) {
			
			System.out.println("Arrendamento #" + (i+1) + ":");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();			
			
			hotel[quarto] = new Hotel(nome, email);

		}
		
		System.out.println("Quartos arrendados:");
		
		for(int i=0;i<hotel.length;i++) {
			
			if(hotel[i] != null)
			System.out.println(i + ": " + hotel[i].getNome() + ", " + hotel[i].getEmail());
		}
		
		sc.close();
		
	}

}
