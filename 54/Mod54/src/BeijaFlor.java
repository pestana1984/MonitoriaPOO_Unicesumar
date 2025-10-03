public class BeijaFlor extends Animal implements IVoador{

    public void voar(){
        System.out.println("Voando rápido...");
    }

    @Override
    public void emitirSom() {
        System.out.println("pssssss...");
    }

    @Override
    public void andar() {

    }

    @Override
    public void comer() {
        System.out.println("Comendo...");
    }

    @Override
    public void dormir() {

    }
}
