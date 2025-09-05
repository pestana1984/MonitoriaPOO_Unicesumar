package Livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TUDO QUE EU ESCREVER A PARTIR DAQUI VAI SER EXECUTADO COMO PROGRAMA.
        Estante estante;
        int tamanho;
        Livro livro;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tamanho da estante: ");
        tamanho = teclado.nextInt();

        estante = new Estante(tamanho);

        //Cadastra os livros na estante
        for (int i = 0; i < tamanho; i++) {
            livro = new Livro();
            estante.livros[i] = livro;
        }

        estante.exibirEstante();
        }
}