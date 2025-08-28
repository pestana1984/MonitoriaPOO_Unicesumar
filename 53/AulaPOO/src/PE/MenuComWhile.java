package PE;

import java.util.Scanner;

public class MenuComWhile {
    public static void main(String[] args) {

        /*ENQUANTO A ESCOLHA NÃO FOR IGUAL A UMA DAS OPCÕES VÁLIDAS, O MENU É EXIBIDO!*/

        int operacao = 0;
        Scanner entrada = new Scanner(System.in);

        while((operacao < 1) || (operacao > 4)) {
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Informe a operação desejada:");
            operacao = entrada.nextInt();
        }

        do{
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Informe a operação desejada:");
            operacao = entrada.nextInt();
        }while((operacao < 1) || (operacao > 4));

        for(operacao = 0; operacao < 1 || operacao > 4; ){
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Informe a operação desejada:");
            operacao = entrada.nextInt();
        }

    }
}