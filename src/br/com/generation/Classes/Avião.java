package br.com.generation.Classes;

public class Avião {
	
	public String modeloAviao;
	public String tipoAviao;
	public int combustivelAviao;
	public int qtdPassageiros;
	
	public void mostrarInfo() {
		System.out.println("\nO Modelo Do Avião é: ");
		System.out.println("---------> "+modeloAviao);
		System.out.println("\nDo Tipo: ");
		System.out.println("---------> "+tipoAviao);
		System.out.println("\nQuantidade De Passageiros Suportada: ");
		System.out.println("---------> "+qtdPassageiros);
	}
	
	public void mostrarCombustivel(int quantidade) {
		combustivelAviao = quantidade;
		
		System.out.println("\n\n***************** Medidor De Combustivel *************************");
		System.out.print("0%");
		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}
		System.out.println("100%");
		System.out.print("  ");
		for (int i = 0; i < quantidade ; i++) {
			System.out.print("|");
			
		}
		System.out.println("\n\n************************************** ^ Quantidade Disponivel ^ *****************************************^");

		
		if(combustivelAviao<40) {
			System.out.println("\n\n\t\t\t\tAbasteça Imediatamente!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}

