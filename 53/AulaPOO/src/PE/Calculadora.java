package PE;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        //Declaração das variáveis
        float numero1;
        double numero2;
        int operacao;

        String resultadoFormatado;

        Scanner entrada = new Scanner(System.in);

        //Pede os valores ao usuário
        System.out.print("Digite o primeiro valor: ");
        numero1 = entrada.nextFloat();

        System.out.print("Digite o segundo valor: ");
        numero2 = entrada.nextFloat();

        //Mostra um "menu" de opções para calculo.
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Informe a operação desejada:");
        operacao = entrada.nextInt();

        /*Agora executa a operação escolhida pelo usuário e mostra o resultado*/
        if(operacao == 1){
            resultadoFormatado = String.format("%.2f", (numero1 + numero2));
            System.out.println("O resultado da soma é: " + resultadoFormatado);
        }
        else if(operacao == 2){
            System.out.println("O resultado da subtração é: " + (numero1 - numero2));
        }
        else if(operacao == 3){
            System.out.println("O resultado da multiplicação é: " + (numero1 * numero2));
        }
        else{
            if(numero2 == 0)
                System.out.println("Impossivel dividir por 0");
            else{
                //formata o numero para 2 casas decimais
                resultadoFormatado = String.format("%.2f", (numero1 / numero2));
                System.out.println("O resultado da divisão é: " + resultadoFormatado);
                //exibe o valor correto
                System.out.println(numero1 / numero2);
                //tipos de arredondamentos
                System.out.println(Math.round(numero1 / numero2));
                System.out.println(Math.round((numero1 / numero2)*1000f)/1000f);

            }
        }
    }
}
