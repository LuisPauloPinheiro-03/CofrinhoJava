package uninter;

public class Real extends Moeda {

	public Real(double qtd) {              //Constutor do Real que sera replicado em outras moedas
		this.valor = qtd;
	}
	public void info() {
		System.out.println("Real - " + valor);
	}

	
	public double converter() {
		return this.valor;
	}

	public boolean equals(Object objeto) {
		if(this.getClass() != objeto.getClass()) {
		return false;
		}
	
		Real objetoDeReal = (Real) objeto;     //Aqui é usado para saber se o valor informado para remover consta dentro do cofrinho para ser removido, caso não a operação não é concluida
		
		if (this.valor != objetoDeReal.valor){
			return false;
		}
	return true;
	}
	
	
}

//RU: 4299877
