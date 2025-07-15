package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listarMoedas;
	
	public Cofrinho() {
		this.listarMoedas = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda) {
		this.listarMoedas.add(moeda);
		
	}
	public void remover(Moeda moeda) {
		this.listarMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		if (this.listarMoedas.isEmpty()) {
			System.out.println("!!!Cofrinho Vazio!!!");
			return;
		}
		
		for (Moeda moeda : this.listarMoedas) {
			moeda.info();
		}
		
	}

	public double totalConvertido() {
		
		if(this.listarMoedas.isEmpty()) {
			return 0;
		}
		double totalAcumulado = 0;
		for (Moeda moeda : this.listarMoedas) {
			totalAcumulado = totalAcumulado + moeda.converter();   //Mostrar o Total convertido
	}
	return totalAcumulado;
 }

	
	
}

//RU: 4299877
