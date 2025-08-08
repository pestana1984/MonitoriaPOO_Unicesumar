import java.util.Scanner;

public class Comparacao {
    public static void main(String args[]) {
        int x, y;
        Scanner ler;

        System.out.println("Digite o valor que deseja comparar: ");

        ler = new Scanner(System.in);
        x = ler.nextInt();

        System.out.println("O valor informado foi: " + x);

        System.out.println("Digite o valor de comparação: ");

        ler = new Scanner(System.in);
        y = ler.nextInt();

        System.out.println("O valor informado foi: " + y);

        if(x == y){
            System.out.println("O valor " + x + " é igual ao " + y);
        }
        else if(x > y){
            System.out.println("O valor " + x + " é maior que " + y);
        }
        else{
            System.out.println("O valor "+ x + " é menor que " + y);
        }

    }
}
