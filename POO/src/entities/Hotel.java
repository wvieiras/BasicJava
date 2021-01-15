package entities;

public class Hotel {
	
	public String nome;
	public String email;
	public int quarto;
	
	//Constructor
	public Hotel(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}	
}
