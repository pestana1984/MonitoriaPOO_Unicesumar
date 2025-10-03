package Pilares;

public abstract class Pessoa {
    String nome;
    String cor;
    char sexo;
    double altura;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}
