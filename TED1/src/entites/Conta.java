package entites;

public class Conta {
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int numero;
    double saldo;

    public Conta() {
    }

    boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}