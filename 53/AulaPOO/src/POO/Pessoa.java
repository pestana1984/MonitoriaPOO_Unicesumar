package POO;

public class Pessoa {
    //Propriedades ou Atributos
    String nome;
    int idade;
    char sexo;

    //Metodos ou Operação
    public void definirNome(String n){ //Set
        this.nome = n;
    }

    public String mostrarNome(){ //Get
        return this.nome;
    }

    public void definirIdade(int n){
        this.idade = n;
    }

    public int mostrarIdade(){
        return this.idade;
    }

}
