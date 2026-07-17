package com.br.sistemabancario;

public class Conta {
	private Usuario usuario;
	private String tipo;
	private int saldo;
	private int limite;
	
	public Conta(Usuario usuario, String tipo, int saldo, int limite) {
		this.usuario = usuario;
		this.tipo = tipo;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	//mostra extrato, realiza depositos, realiza saques
	
}
