package br.com.generation.ContaBancaria;

public class Conta {
	
	public String nomeTitular;
	public int numeroConta;
	public int digitoConta;
	public double valorConta;
	
	public void mostraInfo() {
	
	System.out.println("Nome Titular: "+nomeTitular);
	System.out.println("Numero da conta: "+numeroConta+"-"+digitoConta);
	System.out.printf("Valor Na Conta: R$%.2f", valorConta);
	}
    public void depositar(double deposito) {
    	valorConta += deposito;
    	System.out.printf("\nSeu novo valor em conta R$ %.2f", valorConta);
    }
 }  
