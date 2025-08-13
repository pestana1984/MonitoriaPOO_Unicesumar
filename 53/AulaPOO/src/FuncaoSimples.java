import java.util.Scanner;

public class FuncaoSimples {


    public static void Menu(){
        int operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Informe a operação desejada:");
        operacao = entrada.nextInt();
    }

    public static void main(String[] args) {
        while(true){
            Menu();
        }
    }

}
