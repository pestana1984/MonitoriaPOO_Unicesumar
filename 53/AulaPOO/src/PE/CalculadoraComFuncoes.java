package PE;

import java.util.Scanner;

public class CalculadoraComFuncoes {

    //Declaração de variáveis GLOBAIS
    static double n1, n2;

    public static void LerNumeros() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        n1 = entrada.nextDouble();

        System.out.println("Informe o segundo numero: ");
        n2 = entrada.nextDouble();
    }

    public static int Menu() {
        Scanner entrada = new Scanner(System.in);
        //int escolha;

        System.out.println("0 - Informar Numeros");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair do Programa\n");
        System.out.print("Informe a operação desejada:");

        //escolha = entrada.nextInt();
        //return escolha;

        return entrada.nextInt();
    }

    public static double Somar(double x, double y) {
        return x + y;
    }

    public static double Subtrair(double x, double y) {
        return x - y;
    }

    public static double Multiplicar(double x, double y) {
        return x * y;
    }

    public static double Dividir(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Impossível dividir por zero!");
            return 0;
        }
    }

    public static void MostraResultado(double r){
        System.out.println("Resultado: " + r);
    }

    public static void main(String[] args) {
        int opcaoMenu;
        double resultado = 0;

        LerNumeros();

        do {
            opcaoMenu = Menu();
            switch (opcaoMenu) {
                case 0:
                    LerNumeros();
                    break;
                case 1:
                    resultado = Somar(n1, n2);
                    MostraResultado(resultado);
                    break;
                case 2:
                    resultado = Subtrair(n1, n2);
                    MostraResultado(resultado);
                    break;
                case 3:
                    resultado = Multiplicar(n1, n2);
                    MostraResultado(resultado);
                    break;
                case 4:
                    resultado = Dividir(n1, n2);
                    MostraResultado(resultado);
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcaoMenu != 5);
    }
}
