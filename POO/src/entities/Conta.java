package entities;

public class Conta {
	//Attribute
	private int numeroConta;
	private String nomeTitular;
	private double depositoInicial;
	
	//Constructor
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.depositoInicial = depositoInicial;
	}


	//Getters and Setters
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getDepositoInicial() {
		return depositoInicial;
	}


	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	
	//Methods
	public void depositar(double valor) {
		this.depositoInicial += valor;
	}
	
	public void retirar(double valor) {
		this.depositoInicial -= (valor + 5);
	}
	
	public String toString(){
		return "Account " + this.numeroConta + " Holder: " + this.nomeTitular + " Balance: $ " + this.depositoInicial;
	}
}
