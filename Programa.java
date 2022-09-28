public class Programa {
    public static void main(String[] args) {
        Cliente guido = new Cliente("Guido Filho", "123.456.789-00", "Programador");
        ContaCorrente contaDoGuido = new ContaCorrente(1234, 5678, guido, 1000);
        Conta contaPoupancaDoGuido = new ContaPoupanca(2345, 6789, guido, 1000);
        ContaSalario contaSal = new ContaSalario(1111, 2222, guido, 1000);
        contaDoGuido.depositar(300);
        contaPoupancaDoGuido.depositar(300);
        contaSal.depositar(300);
        System.out.println("Saldo da conta corrente: " + contaDoGuido.getSaldo());
        System.out.println("Saldo da conta poupança: " + contaPoupancaDoGuido.getSaldo());
        System.out.println("Saldo da conta salário: " + contaSal.getSaldo());
        contaDoGuido.sacar(100);
        contaPoupancaDoGuido.sacar(100);
        contaSal.sacar(100);
        System.out.println("Saldo da conta corrente depois do saque: " + contaDoGuido.getSaldo());
        System.out.println("Saldo da conta poupança depois do saque: " + contaPoupancaDoGuido.getSaldo());
        System.out.println("Saldo da conta salário depois do saque: " + contaSal.getSaldo());
    }
}
