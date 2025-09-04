package Livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TUDO QUE EU ESCREVER A PARTIR DAQUI VAI SER EXECUTADO COMO PROGRAMA.
        Scanner teclado = new Scanner(System.in);

        Livro livro1 = new Livro();
        //Livro livro2 = new Livro();

        livro1.abrirLivro();
        livro1.lerLivro();
        livro1.fecharLivro();
        livro1.venderLivro();

    }
}