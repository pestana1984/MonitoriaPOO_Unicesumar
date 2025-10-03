public class Pagamento implements IPagamento {

    String meioDePagamento;

    @Override
    public void executarPagamento(String meioDePagamento) {
        System.out.println("Conta paga com " + meioDePagamento);
    }
}
