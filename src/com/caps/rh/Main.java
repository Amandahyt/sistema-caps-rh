package com.caps.rh;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funcionario funcionaria = new Funcionario("Amanda Rodrigues", "042-544-340-43", 1800);
        Gerente gerente = new Gerente("Dwight Schrute", "920-043-043-32", 5000.0, 2500);

        System.out.println("FUNCIONÁRIA");
        System.out.println("Nome: " + funcionaria.getNome());
        System.out.println("CPF: " + funcionaria.getCpf());
        System.out.println("Salário: R$" + funcionaria.getSalario());
        System.out.println("");

        System.out.println("GERENTE");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Cpf: " + gerente.getCpf());
        System.out.println("Salário: R$" + gerente.getSalario());
        System.out.println("Bônus anual: R$" + gerente.getBonusAnual());
        System.out.println("Remuneração completa: R$ " + gerente.calcularRemuneracaoTotal());

        System.out.println("Aplicando aumento de 10% para o salário da funcionária");
        funcionaria.aplicarAumento(10);
        System.out.println("");
        System.out.println("Novo salário da funcionária: R$ " + funcionaria.getSalario());
        }
    }
