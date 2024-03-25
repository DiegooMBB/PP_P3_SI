package entities;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    private boolean depositar(double valor) {
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