package entities;

public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public boolean sacar(double valor) {
        if(this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - (valor * this.taxa));
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor >= 0) {
            this.setSaldo(this.getSaldo() + (valor * this.taxa));
            return true;
        } else {
            return false;
        }
    }

    private void aplicarRendimento() {
        this.setSaldo(this.getSaldo() * this.taxa);
    }

    public int getPrazo() {
        return prazo;
    }
}