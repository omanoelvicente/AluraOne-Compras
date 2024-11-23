public class CartaoCredito {
    private double limite;
    private double saldo;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite() {
        return limite;
    }
    public double getSaldo() {
        return saldo;
    }


    public boolean verificaSaldo(double valor) {
        if (this.getSaldo() > valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
