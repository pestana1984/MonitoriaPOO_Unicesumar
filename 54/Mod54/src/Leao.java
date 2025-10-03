public class Leao extends Animal {

    public Leao(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Rosnando...");
    }

    @Override
    public void andar() {
        System.out.println("Andando...");
    }
}
