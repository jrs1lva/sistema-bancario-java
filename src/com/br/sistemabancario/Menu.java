package com.br.sistemabancario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	
	//fazer laço de repetição, separar classes, fazer validações
	//return true; if false (encerrar aplicativo)
	
	public void run(Banco banco) {
		Usuario usuario = cadastrarUsuario(banco);
		if (usuario != null) {
			Conta conta = criarConta(banco, usuario);
			if (conta != null) {
				menuPrincipal(conta, banco);
			}
		}
	}
	
	private Usuario cadastrarUsuario(Banco banco) {
		
		System.out.println("Olá, seja bem vindo ao Banco " + banco.getNOME());
	    System.out.println("Para começar, nos informe seus dados pessoais:");
	    
	    System.out.print("Nome completo: ");
	    String nome = scanner.nextLine();
	    
	    System.out.print("\nPrefere ser chamado de: ");
	    String apelido = scanner.nextLine();
	    
	    // 1. Declaramos a variável fora do loop
	    LocalDate dataNascimento = null;
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    boolean dataValida = false;
	    
	    // 2. Laço de repetição até a data ser válida
	    while (!dataValida) {
	        System.out.print("\nData de nascimento (dd/MM/yyyy): ");
	        String data = scanner.nextLine();
	        
	        try {
	            dataNascimento = LocalDate.parse(data, formatter);
	            dataValida = true; // Se não lançou exceção, a data é válida e sai do loop!
	        } catch (java.time.format.DateTimeParseException e) {
	            System.out.println("Data inválida! Por favor, digite no formato dd/MM/yyyy (ex: 04/03/2004).");
	        }
	    }
	    
	    System.out.print("\nCPF: ");
	    String cpf = scanner.nextLine();
	    
	    Usuario usuario = new Usuario(nome, apelido, dataNascimento, cpf);
	    banco.cadastrarUsuario(usuario);
	    
	    return usuario;
	}
	
	private Conta criarConta(Banco banco, Usuario usuario) {
		
		int opcao;
		Tipo tipo = null;
		
		do {
			System.out.println("\nQual tipo de conta se encaixa mais no seu perfil:\n[1] CORRENTE | [2] POUPANÇA");
			opcao = scanner.nextInt();
			
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
		} while (opcao!= 1 && opcao != 2);
		
		Conta conta = banco.criarConta(usuario.getCPF(), tipo);
		return conta;
	}
	
	public void menuPrincipal(Conta conta, Banco banco) {
		System.out.println("\nParabéns por efetuar seu cadastro no banco, " + conta.getUsuario().getApelido());
		int opcao;
		
		do {
			System.out.println("\nQual funcionalidade deseja utilizar?\n[1] Depositar | [2] Sacar | [3] Mostrar Extrato | [4] Encerrar aplicativo");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			
			
			
			case 1:
				System.out.print("\nValor do depósito: ");
				int valorDeposito = scanner.nextInt();
				
				conta.depositar(valorDeposito);
				System.out.println("\nOperação realizada com sucesso!\nSaldo atual: R$ " + conta.getSaldo());
				break;
				
			case 2:
				System.out.print("\nValor do saque: ");
				int valorSaque = scanner.nextInt();
				
				conta.sacar(valorSaque);
				System.out.println("\nOperação realizada com sucesso!\nSaldo atual: R$ " + conta.getSaldo());
				break;
				
			case 3:
				conta.mostrarExtrato();
				break;
				
			case 4:
				System.out.printf("\nSistema encerrado!\nSaldo Final: %.2f", conta.getSaldo());
				break;
				
			default:
				throw new IllegalArgumentException("\nValor inválido");
			}
		} while (opcao != 4);
		
	}
}
