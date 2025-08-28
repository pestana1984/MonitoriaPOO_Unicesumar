package PE;

import java.util.Scanner;

public class CalculoMediaAluno {
    public static void main (String[] args){
        float nota1, nota2, nota3, nota4, media;
        Scanner entrada = new Scanner (System.in);

        System.out.printf("Digite a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.printf("Digite a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.printf("Digite a terceira nota: ");
        nota3 = entrada.nextFloat();

        System.out.printf("Digite a ultima nota: ");
        nota4 = entrada.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + media);

        if(media < 4){
            System.out.println("Você dançou dessa vez.");
        }
        else if(media >= 4 && media < 6){
            System.out.println("Você vai ter uma segunda chance!");
        }
        else{
            System.out.println("Pode seguir para o próximo semestre!");
        }
    }
}
