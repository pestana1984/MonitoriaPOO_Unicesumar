package POO;

import java.util.Date;

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

    public void definirSexo(char s){
        if(s != 'M' || s != 'F'){
            System.out.println("Opção Inválida!");
        }
        else{
            this.sexo = s;
        }
        /*if(s == 'M' || s == 'F'){
            this.sexo = s;
        }
        else{
            System.out.println("Opção Invalida!");
        }*/
    }

    public String mostrarSexo(){
        if(this.sexo == 'M'){
            return "Masculino";
        }
        else{
            return "Feminino";
        }
    }

    public String mostrarDados(){

        return ("Nome: " + this.mostrarNome()
                + "\nSexo: " + this.mostrarSexo()
                + "\nIdade: " + this.mostrarIdade()
                + "\n"
        );
    }

    public Pessoa(){

    }






}
