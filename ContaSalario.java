public class ContaSalario extends Conta {

    public ContaSalario(int agencia, int numeroConta, Cliente titular, double limite) {
        super(agencia, numeroConta, titular, limite);
    }

    @Override
    public boolean sacar(double valor) {
        valor += valor * 0.01;
        return super.sacar(valor);
    }
}
