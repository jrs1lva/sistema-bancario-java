package com.br.sistemabancario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
	Scanner scanner = new Scanner(System.in);
	
	public void iniciar(Banco banco) {
		System.out.println("Olá, seja bem vindo ao Banco" + banco);
		System.out.println("Para começar, nos informe seus dados pessoais:");
		
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("\nPrefere ser chamado de: ");
		String apelido = scanner.nextLine();
		
		System.out.print("\nData de nascimento (dd/MM/yyyy): ");
		String data = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataNascimento = LocalDate.parse(data, formatter);
		
		System.out.print("\nCPF: ");
		String cpf = scanner.nextLine();
		
		
		Usuario usuario = new Usuario(nome, apelido, dataNascimento, cpf);
		
		
		//String nome, String apelido, LocalDate dataNascimento, String cpf
		//Apresentação do banco, cadastro do usuário, cadastro no banco, 
	}
}
