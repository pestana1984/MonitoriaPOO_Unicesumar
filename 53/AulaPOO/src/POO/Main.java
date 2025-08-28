package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        String n;

        Scanner sc = new Scanner(System.in);

        /*p1.nome = "Felipe";
        p1.sexo = 'M';
        p1.idade = 30;*/

        /*p2.nome = "Maria";
        p2.sexo = 'F';
        p2.idade = 20;*/

        /*System.out.println("O nome da primeira pessoa cadastrada é: " + p1.nome);
        System.out.println("O sexo da primeira pessoa cadastrada é: " + p1.sexo);
        System.out.println("O idade da primeira pessoa cadastrada é: " + p1.idade);

        System.out.println("O nome da segunda pessoa cadastrada é: " + p2.nome);
        System.out.println("O sexo da segunda pessoa cadastrada é: " + p2.sexo);
        System.out.println("O idade da segunda pessoa cadastrada é: " + p2.idade);*/

        System.out.println("Informe o nome desejado: ");
        n = sc.nextLine();
        p1.definirNome(n);


        System.out.println("O nome da primeira pessoa é: " + p1.mostrarNome());



    }

}
