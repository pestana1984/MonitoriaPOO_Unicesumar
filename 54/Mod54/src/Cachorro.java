public class Cachorro implements IPagamento{
    public void voar()
    {
        System.out.printf("Cachorro voando...");
    }

    @Override
    public void executarPagamento(String meioDePagamento)
    {   }
}
