package entities;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public boolean sacar(double valor) {
        if((this.getSaldo() + this.limite) >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }
}