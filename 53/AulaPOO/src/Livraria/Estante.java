package Livraria;

public class Estante {

    Livro[] livros;

    public Estante(int tamanho){
        this.livros = new Livro[tamanho];
    }

    public void exibirEstante(){

        for(int i = 0; i < this.livros.length; i++){
            System.out.println(livros[i].mostrarLivro());
        }
    }

    public void guardaLivro(Livro l){
        //aqui vai o código de voces.
    }
}
