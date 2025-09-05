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

    //Método Construtor
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

    public void alterarPreco(double novopreco){
        this.preco = novopreco;
        System.out.println("O valor do livro foir alterado para :" + novopreco);
    }

    public void receberDesconto(int desconto){

        this.preco = this.preco - (this.preco * desconto / 100);
        System.out.println("O valor do livro com desconto é: " + this.preco);
    }

    public String mostrarLivro(){
        return ("\nTitulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nCategoria: " + this.categoria +
                "\nQuantidade de Páginas: " + this.qtddepaginas +
                "\nISBN: " + this.isbn +
                "\nPreço do livro: " + this.preco);
    }

}
