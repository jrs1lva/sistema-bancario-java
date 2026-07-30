package com.br.sistemabancario;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	
	public void run(Banco banco) {
		System.out.println("Olá, seja bem vindo ao Banco" + banco.getNOME());
		System.out.println("Para começar, nos informe seus dados pessoais:");
		
		System.out.print("Nome completo: ");
		String nome = scanner.nextLine();
		
		System.out.print("\nPrefere ser chamado de: ");
		String apelido = scanner.nextLine();
		
		System.out.print("\nData de nascimento (dd/MM/yyyy): ");
		String data = scanner.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNascimento = LocalDate.parse(data, formatter);
		
//		try {
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			LocalDate dataNascimento = LocalDate.parse(data, formatter);
//		} catch (DateTimeException e) {
//			System.out.println("Data inválida, digite uma data no formato dd/MM/yyyy");
//		}
		
		System.out.print("\nCPF: ");
		String cpf = scanner.nextLine();
		
		
		Usuario usuario = new Usuario(nome, apelido, dataNascimento, cpf);
		banco.cadastrarUsuario(usuario);
		
//		System.out.println("Aguarde um momento, estamos processando suas informações!");
		
		System.out.println("\nQual tipo de conta se encaixa mais no seu perfil:\n[1] CORRENTE | [2] POUPANÇA");
		int opcao = scanner.nextInt();
		
		Tipo tipo;
		
		switch (opcao) {
		
			case 1:
				tipo = Tipo.CORRENTE;
				break;
			
			case 2:
				tipo = Tipo.POUPANCA;
				break;
				
			default:
				throw new IllegalArgumentException("Valor inválido");
		}
		
		efetuarTransacoes(banco.criarConta(cpf, tipo), banco);
		//fazer verificação de data de nascimento e cpf
	}
	
	public void efetuarTransacoes(Conta conta, Banco banco) {
		System.out.println("Parabéns por efetuar seu cadastro no banco " + conta.getUsuario().getApelido());
		System.out.println("Qual funcionalidade deseja utilizar?\n [1] Depositar | [2] Sacar | [3] Mostrar Extrato");
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.print("Valor do depósito: ");
			int valorDeposito = scanner.nextInt();
			
			conta.depositar(valorDeposito);
			break;
		case 2:
			System.out.print("Valor do saque: ");
			int valorSaque = scanner.nextInt();
			
			conta.sacar(valorSaque);
			break;
		case 3:
			conta.mostrarExtrato();
		default:
			throw new IllegalArgumentException("Valor inválido");
		}
		
	}
}
