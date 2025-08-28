package PE;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        int tamanho;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");

        tamanho = leitura.nextInt();
        //leitura.nextLine();

        String[] nomes  = new String[tamanho];

        //Leitura dos dados do meu vetor nomes

        for (int i = 0; i < tamanho; i++){
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = leitura.next();
        }

        for (int i = 0; i < tamanho; i++){
            System.out.println("O nome da posição "+ i + " é: " +nomes[i]);
        }
    }
}
