package PE;

import java.util.Scanner;

public class FuncaoComParametros {

    public static void HelloWorld(String nome, int idade){
        System.out.println("Seja bem vindo, "+ nome + " !" );
        System.out.println("Voce tem " + idade +" anos.");
    }

    public static void Soma(int x, int y){
        System.out.println("Soma: "+ (x+y));
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String n;
        int i;

        System.out.println("Digite seu nome:");
        n = entrada.nextLine();

        System.out.println("Digite sua idade:");
        i = entrada.nextInt();

        HelloWorld(n,i);

        Soma(10, 20);
    }
}
