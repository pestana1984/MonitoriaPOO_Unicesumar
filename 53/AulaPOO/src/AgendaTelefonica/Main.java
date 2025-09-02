package AgendaTelefonica;

import java.util.Scanner;

public class Main {

    static Contato CadastrarContato(){
        String nome, telefone, email;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do contato a ser salvo: ");
        nome = sc.nextLine();
        System.out.println("Digite o telefone do contato a ser salvo: ");
        telefone = sc.nextLine();
        System.out.println("Digite o email do contato a ser salvo: ");
        email = sc.nextLine();

        return new Contato(nome, telefone, email);
    }

    public static void main(String[] args) {

        //tipo, nome da variavel (reserva de espaço na memória) -- DECLARANDO AS VARIÁVEIS E OBJETOS QUE VOU USAR!
        Contato c1, c2;

        // Instanciar um objeto é criar ele na área de memória já reservada na declaração acima!
        //c = new Contato("Felipe", "1234", "a@a.com");
        c1 = CadastrarContato();

        c1.mostraContato();

        c1.setTelefone2("898765");
        c1.setInstagram("askjdhgbabf");

        c1.mostraContato();

        c2 = CadastrarContato();
        c2.mostraContato();



    }
}
