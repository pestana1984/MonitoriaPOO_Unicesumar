package Pilares;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Joao";
        f1.cor = "Caucasiano";
        f1.altura = 1.80;
        f1.sexo = 'M';

        System.out.println(f1.getNome());;

        f1.setSalario(5000);
        f1.setSalario();

        System.out.println(f1.mostraFuncionario());

        f1.setSalario(10000);

        System.out.println(f1.mostraFuncionario());;

        Funcionario f2 = new Funcionario("Felipe");

        Funcionario f3 = new Funcionario(3000, "Ygor");
    }
}
