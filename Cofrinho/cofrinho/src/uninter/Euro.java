package uninter;

public class Euro extends Moeda {

	public Euro(double qtd) {              
		this.valor = qtd;
	}
		
	public void info() {
		System.out.println("Euro - " + valor);
	}
	
	public double converter() {         //Usado para converter o valor Euro para o real na atual cotação
		return this.valor * 5.39;
	}
	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
		return false;
		}
	
		Euro objetoDeEuro = (Euro) objeto;
		
		if (this.valor != objetoDeEuro.valor){
			return false;
		}
	return true;
	}
}
//RU: 4299877