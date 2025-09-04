package Livraria;

import java.util.Scanner;

public class Livro {

    //PROPRIEDADES OU ATRIBUTOS
    String titulo;
    String autor;
    String categoria;
    int qtddepaginas;
    int isbn;
    double preco;

    //MÉTODOS ou OPERAÇÕES

    public Livro(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o título do livro: ");
        this.titulo = teclado.nextLine();

        System.out.println("Informe a categoria do livro: ");
        this.categoria = teclado.nextLine();

        System.out.println("Informe o ISBN do livro: ");
        this.isbn = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Informe o autor do livro: ");
        this.autor = teclado.nextLine();

        System.out.println("Informe a quantidade de paginas do livro: ");
        this.qtddepaginas = teclado.nextInt();

        System.out.println("Informe o preço do livro");
        this.preco = teclado.nextDouble();
    }


    public void abrirLivro(){
        System.out.println("Livro aberto!");
    }

    public void fecharLivro(){
        System.out.println("Livro fechado!");
    }

    public void lerLivro(){
        System.out.println("Livro sendo lido!");
    }

    public void venderLivro(){
        System.out.println("Livro vendido!");
    }
}
