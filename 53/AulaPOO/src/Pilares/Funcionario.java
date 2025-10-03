package Pilares;

import java.util.Scanner;

public class Funcionario extends Pessoa {

    private double salario;
    private String cargo;

    public Funcionario(){
        this.cargo = "Funcionario";
    }

    public Funcionario(double salario, String nome){
        this.salario = salario;
        this.nome = nome;
    }

    public Funcionario(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        if(this.salario > 5000){
            this.alterarCargo("Gerente");
        }
    }

    public void setSalario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salario da pessoa:");
        this.salario = sc.nextDouble();
    }

    public void setNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome da pessoa:");
        this.nome = sc.nextLine();
    }

    public double getSalario() {
        return this.salario;
    }

    private void alterarCargo(String novoCargo){
        this.cargo = novoCargo;
    }

    public String mostraFuncionario(){
        return ("Nome: " + this.nome + "\nSalário: " + this.salario + "\nCargo: " + this.cargo);
    }
}
