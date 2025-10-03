public class Passaro extends Animal implements IVoador{

    public void emitirSom() {
        System.out.println("Piu piu!");
    }

    public void andar() {
        System.out.println("Pulando...");
    }

    public void comer() {
        System.out.println("Comendo...");
    }
    public void dormir() {
        System.out.println("Dormindo...");
    }

    public void voar() {
        System.out.println("Voando bem...");
    }
}
