package br.com.generation.Classes;

import java.util.Scanner;

public class Avião1 {

	public static void main(String[] args) {
		
		Avião Avião1 = new Avião();
		Scanner tc = new Scanner(System.in);
		int quantidade;
		
		System.out.println("Digite o modelo do avião: ");
		Avião1.modeloAviao = tc.nextLine().toUpperCase();
		System.out.println("Digite o Tipo do avião: (Comercial | Militar | Privado | Governo ");
		Avião1.tipoAviao = tc.nextLine().toUpperCase();
		System.out.println("Digite a quantidade de passageiros suportados: ");
		Avião1.qtdPassageiros = tc.nextInt();
		System.out.println("Digite a porcentagem de combustivel no tanque: ");
		quantidade = tc.nextInt();
		
		
		Avião1.mostrarInfo();
		Avião1.mostrarCombustivel(quantidade);
		
		tc.close();
		

	}

}
