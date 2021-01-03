package entities;

public class Funcionario {
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido (){
		return salarioBruto - imposto;
	}
	
	public void incrementoSalario(double incremento) {
		this.salarioBruto = this.salarioBruto + ((this.salarioBruto / 100) * incremento);
	}
	
	public String toString() {
		return name + " , R$ " + (salarioBruto - imposto); 
	}
}
