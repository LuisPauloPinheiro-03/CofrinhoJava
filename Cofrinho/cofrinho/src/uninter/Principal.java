package uninter;

import java.util.Scanner;
                                      //RU: 4299877   RU: 4299877   RU: 4299877
public class Principal {
	
	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Principal() {
		sc = new Scanner(System.in);        // Usado para permitir ao usuario enviar dados e faz com que codigo consiga ler as entradas do usuario
		cofrinho = new Cofrinho();
	}
	
	public static void main(String[] args){
		
		Principal principal = new Principal();
		principal.Menu();					
	}
		
	public void Menu() {
		System.out.println("Cofrinho:");
		System.out.println("1- Adicionar Moeda:");
		System.out.println("2- Remover Moeda:");                                                    
		System.out.println("3- Listar Moedas:");                                      // Tabela de opções para o menu
		System.out.println("4- Calcular valor total convertido para real:");
		System.out.println("0- Encerrar");
		
		String opcaoEscolhida = sc.next(); //responsável por ler a entrada do usuario a partir do console e armazena-la na variável
		
		switch (opcaoEscolhida) {
			case "0":
				System.out.println("Cofrinho Encerrado!");
				break;                  //Aqui uso o Switch e o Break para encerrar o codigo caso seja executado o valor 0
			case "1":
				System.out.println("Escolha Moeda:");
				System.out.println("1 - Real:");
				System.out.println("2 - Dolar:");
				System.out.println("3 - Euro:");
				int moedaEscolhida = sc.nextInt(); //Armazenar moeda escolhida
				System.out.println("Digite o valor:");
				
				String valortDaMoeda = sc.next();
				valortDaMoeda = valortDaMoeda.replace("," ,"."); //Caso o usuario use virgula essa linha transforma ela em ponto para não ter erro no codigo
				double valorDaMoeda = Double.valueOf(valortDaMoeda);
				
				Moeda moeda = null;
				
				if (moedaEscolhida == 1){
					 moeda = new Real(valorDaMoeda);
				} else if (moedaEscolhida == 2) {
					 moeda = new Dolar(valorDaMoeda);
				} else if (moedaEscolhida == 3) {
					 moeda = new Euro (valorDaMoeda);
				} else {
					System.out.println("!!!Opção Invalida!!!");
					Menu();
					break;
				}
				cofrinho.adicionar(moeda);
				Menu();
		        break;
			case "2":
				System.out.println("Escolha Moeda:");
				System.out.println("1 - Real:");
				System.out.println("2 - Dolar:");
				System.out.println("3 - Euro:");
				int moedaEscolhidar = sc.nextInt(); 
				System.out.println("Digite o valor:");
				
				String valortDaMoedar = sc.next();
				
				valortDaMoeda = valortDaMoedar.replace("," ,"."); 
				double valorDaMoedar = Double.valueOf(valortDaMoeda); 
				
				Moeda moedar = null;
				
				if (moedaEscolhidar == 1){
					 moedar = new Real(valorDaMoedar);
				} else if (moedaEscolhidar == 2) {
					 moedar = new Dolar(valorDaMoedar);
				} else if (moedaEscolhidar == 3) {
					 moedar = new Euro (valorDaMoedar);
				} else {
					System.out.println("!!!Opção Invalida!!!");
					Menu();
					break;
				}
				cofrinho.remover(moedar);                 //Função remover moeda
				Menu();
		        break;
		        
			case "3":
				cofrinho.listagemMoedas();
				Menu();
		        break;
			
			case "4":
				double conversaoDasMoedas = cofrinho.totalConvertido();
				String valorFormatado = String.format("%.2f", conversaoDasMoedas); //Limitando e transformando o valor em string em apenas 2 casas apos a virgula
				System.out.println("O valor total convertido para real: " + valorFormatado);
				Menu();
				break;
			default: //Aqui é usado o "Default" para enviar uma mensagem caso o usuario digite um valor diferente do que é permitido no sistema
				System.out.println("!!!Opção Inválida!!!");
		        Menu();
				break;                 
		} 
	} 
	
}
