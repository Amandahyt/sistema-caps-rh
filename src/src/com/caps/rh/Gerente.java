package com.caps.rh;


public class Gerente extends Funcionario {
    private double bonusAnual;


    public Gerente(String nome, String cpf, double salario, double bonusAnual) {
        super(nome, cpf, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public double calcularRemuneracaoTotal() {
        return getSalario() + bonusAnual;
    }
}
