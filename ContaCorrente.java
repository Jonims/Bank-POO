public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numeroConta, Cliente titular, double limite) {
        super(agencia, numeroConta, titular, limite);
    }
    
    @Override
    public void depositar(double valor) {
        valor -= valor * 0.02;
        super.depositar(valor);
    }

    @Override
    public boolean sacar(double valor) {
        valor += valor * 0.01;
        return super.sacar(valor);
    }
}
