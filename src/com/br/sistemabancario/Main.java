package com.br.sistemabancario;

public class Main {

	public static void main(String[] args) {
		
		Banco Bradesco = new Banco("Banco Bradesco", "4002");
		Menu banco = new Menu();
		
		banco.run(Bradesco);
	}

}
