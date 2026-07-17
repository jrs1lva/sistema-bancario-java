package com.br.sistemabancario;

public class Conta {
	private Usuario usuario;
	private String tipo;
	private int saldo;
	private int limite;
	
	public Conta(Usuario usuario, String tipo, int limite) {
		this.usuario = usuario;
		this.tipo = tipo;
		this.saldo = 0;
		this.limite = limite;
	}
	
	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	
	public void mostrarExtrato() {
		
	}
	//mostra extrato, realiza depositos, realiza saques
	
}
