package br.com.generation.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Conta1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		char deposito;
		double valor = 0;
		Scanner tc = new Scanner(System.in);
		Conta conta1 = new Conta();
		
		System.out.println("Digite o nome do titular: ");
		conta1.nomeTitular = tc.nextLine().toUpperCase();
		System.out.println("Digite o numero da conta (Sem o Digito):");
		conta1.numeroConta = tc.nextInt();
		System.out.println("Informe o digito da conta: ");
		conta1.digitoConta = tc.nextInt();
		System.out.println("Qual o valor na conta: R$");
		conta1.valorConta = tc.nextDouble();
		
		conta1.mostraInfo();
		
		System.out.println("\nDeseja depositar? S = Sim | N = não");
		deposito = tc.next().toUpperCase().charAt(0);
		
		do { 
			System.out.printf("Quanto deseja depositar: R$");
			valor = tc.nextDouble();
			conta1.depositar(valor);
			System.out.println("\nDeseja fazer outro deposito? S = Sim | N = Não");
			deposito = tc.next().toUpperCase().charAt(0);
			
		}while(deposito == 's');
		
		tc.close();
		
	}

}
