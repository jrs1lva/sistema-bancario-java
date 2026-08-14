package com.br.sistemabancario;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private final long ID;
	private final Usuario USUARIO;
	private final Tipo TIPO;
	private double saldo;
	private List<String> extrato = new ArrayList<>();
//	private int limite; amadurecer a ideia
	
	public Conta(long ID, Usuario usuario, Tipo tipo) {
		this.USUARIO = usuario;
		this.TIPO = tipo;
		this.saldo = 0;
		this.ID = ID;
	}
	
	public void sacar(double valor) {
		if (valor > getSaldo()) {
			throw new IllegalArgumentException("Valor solicitado maior do que saldo disponível!");
		} else {
			setSaldo(getSaldo() - valor);
			extrato.add(String.format("Saque: R$ %.2f\nSaldo: R$ %.2f", valor, saldo));
		}
	}
	
	public boolean depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor depositado inválido!");
		} else {
			setSaldo(getSaldo() + valor);
			extrato.add(String.format("Depósito: R$ %.2f\nSaldo: R$ %.2f", valor, saldo));
			return true;
		}
	}
	
	public void mostrarExtrato() {
		System.out.println("===== EXTRATO =====\n");
		
		//System.out.println(this.extrato);
		
		for (String transacao : extrato) {
			System.out.println(transacao);
		}
		
		System.out.println("\n-------------------");
		System.out.printf("Saldo Atual: %.2f%n", this.saldo);
	}

	public Usuario getUsuario() {return USUARIO;}

	public Tipo getTipo() {return TIPO;}

	public double getSaldo() {return saldo;}
	private void setSaldo(double saldo) {this.saldo = saldo;}

	public long getID() {return ID;}
	
//	public int getLimite() {return limite;}

//	public void setLimite(int limite) {is.limite = limite;}
	
}
