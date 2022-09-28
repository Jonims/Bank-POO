public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroConta, Cliente titular, double limite) {
        super(agencia, numeroConta, titular, limite);
    }

    @Override
    public boolean sacar(double valor) {
        valor += valor * 0.01;
        return super.sacar(valor);
    }

    public void aplicarRendimento() {
    super.saldo += super.saldo * 0.05;
    }
}
