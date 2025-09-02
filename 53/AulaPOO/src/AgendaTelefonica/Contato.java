package AgendaTelefonica;

public class Contato {
    String nome;
    String telefone1;
    String telefone2;
    String email;
    String instagram;
    String linkedin;
    String apelido;

    public Contato(String n, String t1, String e) {
        this.nome = n;
        this.telefone1 = t1;
        this.email = e;
    }

    public void setTelefone2(String t) {
        this.telefone2 = t;
    }

    public void setInstagram(String i) {
        this.instagram = i;
    }

    public void setLinkedin(String l) {
        this.linkedin = l;
    }

    public void setApelido(String a) {
        this.apelido = a;
    }

    public void mostraContato(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone1: " + this.telefone1);
        System.out.println("Telefone2: " +this.telefone2);
        System.out.println("Email: " + this.email);
        System.out.println("Instagram: " + this.instagram);
        System.out.println("LinkedIn: " + this.linkedin);
        System.out.println("Apelido: " + this.apelido);
    }



}
