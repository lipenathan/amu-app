package com.example.projeto_amu.regras.dominio.calculadora;

public enum Operacao {

    ADICAO(" + "),
    SUBTRACAO(" - "),
    MULTIPLICACAO(" × "),
    DIVISAO(" ÷ "),
    PORCENTAGEM(" % ");

    private String texto = "";

    private Operacao(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
