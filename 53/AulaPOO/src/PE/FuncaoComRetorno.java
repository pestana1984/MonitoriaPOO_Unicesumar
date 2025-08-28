package PE;

import java.util.Scanner;

public class FuncaoComRetorno {

    public static int Menu(){
        //Declaração das variáveis
        int operacao;
        Scanner entrada = new Scanner(System.in);

        //Exibição do Menu
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Informe a operação desejada:");

        //Leitura de entrada do teclado.
        operacao = entrada.nextInt();

        //devolve a opção pra quem chamou (executou) a função.
        return operacao;
    }

    public static void main(String[] args) {
        int x;

        do {
            x = Menu();

            switch (x){
            case 1:
                System.out.println("Escolhido Adição");
                break;
                case 2:
                    System.out.println("Escolhido Subtracao");
                    break;
                case 3:
                    System.out.println("Escolhido Multiplicacao");
                    break;
                case 4:
                    System.out.println("Escolhido Divisao");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }
        }while(x > 4 || x < 1);
    }
}
