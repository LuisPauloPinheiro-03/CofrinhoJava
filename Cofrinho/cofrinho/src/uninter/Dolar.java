package uninter;

public class Dolar extends Moeda {

	public Dolar(double qtd) {              
		this.valor = qtd;
	}
		
	public void info() {
		System.out.println("Dolar - " + valor);
	}
	
	public double converter() {         //Usado para converter o valor dolar para o real na atual cotação
		return this.valor * 4.80;
	}
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
		return false;
		}
	
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor){
			return false;
		}
	return true;
	}
}
//RU: 4299877
