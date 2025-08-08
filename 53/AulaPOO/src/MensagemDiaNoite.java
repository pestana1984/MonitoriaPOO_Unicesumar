import java.util.Scanner;

public class MensagemDiaNoite {
    public static void main(String args[]) {

        int horaDoDia;
        String nomedoSerHumano;
        Scanner leituraDoTeclado;

        System.out.println("Informe SOMENTE a hora de agora:");
        leituraDoTeclado = new Scanner(System.in);
        horaDoDia = leituraDoTeclado.nextInt();

        System.out.println("Informe o seu Nome:");
        leituraDoTeclado = new Scanner(System.in);
        nomedoSerHumano =  leituraDoTeclado.nextLine();

        if(horaDoDia < 12){
            System.out.println("Bom dia, " + nomedoSerHumano + "!");
        }
        else if(horaDoDia < 18){
            System.out.println("Boa tarde, " + nomedoSerHumano +"!");
        }
        else{
            System.out.printf("Boa noite, " + nomedoSerHumano +"!");
        }

        System.out.println();
    }
}
