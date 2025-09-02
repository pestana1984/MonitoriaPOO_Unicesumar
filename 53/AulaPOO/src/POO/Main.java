package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Scanner sc = new Scanner(System.in);

        String n;
        char s;
        int x;

        System.out.println("Informe o nome desejado: ");
        n = sc.nextLine();
        p1.definirNome(n);

        System.out.println("Informe o sexo da pessoa: ");
        n = sc.nextLine();
        s = n.charAt(0);
        p1.definirSexo(s);

        System.out.println("Informe a idade da pessoa: ");
        n = sc.nextLine();
        x = Integer.parseInt(n);
        p1.definirIdade(x);

        n = p1.mostrarDados();

        System.out.printf(n);
    }

}
