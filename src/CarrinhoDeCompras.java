import java.util.*;

import static java.lang.System.in;

public class CarrinhoDeCompras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        List<Item> lista = new ArrayList<>();


        System.out.println("Digite o limite do cartão");
        double valorLimite = scanner.nextDouble();
        CartaoCredito meuCartao = new CartaoCredito(valorLimite);
        System.out.println("Seu limite R$:" + meuCartao.getLimite());
        int i = 1;
        while (i != 0) {
            System.out.println("Digite a descrição da compra");
            String descricaoItem = scanner.next();

            System.out.println("Digite o valor da compra");
            double valorItem = scanner.nextDouble();
            Item meuItem = new Item(descricaoItem, valorItem);

            if (meuCartao.verificaSaldo(meuItem.getValorItem())) {
                System.out.println("Compra realizada dom sucesso!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
            System.out.println("Escolha uma opção: [0] - Sair [1] - Continuar comprando");
            i = (scanner.nextInt());
            lista.add(meuItem);
            System.out.flush();
        }
        Collections.sort(lista);
        lista.forEach(System.out::println);
        System.out.println("Saldo: " + meuCartao.getSaldo());

    }

}
