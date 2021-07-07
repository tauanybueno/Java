public class Main {
    public static void main(String[] args) {
        Automovel a1 = new Automovel();
        Automovel a2 = new Automovel();
        Automovel a3 = new Automovel();

        a1.venda();
        a2.venda();
        a3.venda();

        System.out.println("Quantidade de vendas: " + Automovel.getAutomovelIsVendido());

    }
}
