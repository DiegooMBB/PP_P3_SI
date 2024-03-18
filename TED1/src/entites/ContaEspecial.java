package entites;

public class ContaEspecial extends Conta {
    public double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    boolean sacar(double valor) {
        if((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}