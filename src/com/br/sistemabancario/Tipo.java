package com.br.sistemabancario;

public enum Tipo {
	
	CORRENTE("Conta Corrente"),
    POUPANCA("Conta Poupança");

    private final String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
