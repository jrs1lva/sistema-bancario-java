package com.br.sistemabancario;

public class Conta {
	
	private final long ID;
	private Usuario usuario;
	private Tipo tipo;
	private float saldo;
//	private int limite; amadurecer a ideia
	
	public Conta(Usuario usuario, Tipo tipo) {
		this.usuario = usuario;
		this.tipo = tipo;
		this.saldo = 0;
		this.ID = 1;
	}
	
	public void sacar(float valor) {
		if (valor > getSaldo()) {
			throw new IllegalArgumentException("[ERRO] Valor solicitado maior do que saldo disponível!");
		} else {
			setSaldo(getSaldo() - valor);
			System.out.println("Operação realizada com sucesso!\nSaldo Atual:" + getSaldo());
		}
	}
	
	public void depositar(float valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor depositado inválido!");
		} else {
			setSaldo(getSaldo() + valor);
			System.out.println("Operação realizada com sucesso!\nSaldo Atual:" + getSaldo());
		}
	}
	
	public void mostrarExtrato() {
		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

//	public int getLimite() {
//		return limite;
//	}
//
//	public void setLimite(int limite) {
//		this.limite = limite;
//	}

	public long getID() {
		return ID;
	}
	
	
}
