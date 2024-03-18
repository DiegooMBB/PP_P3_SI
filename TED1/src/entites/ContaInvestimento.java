package entites;

public class ContaInvestimento extends Conta {
    public double taxa;
    public int prazo;

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= (valor * this.taxa);
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo += (valor * this.taxa);
            return true;
        } else {
            return false;
        }
    }

    public void aplicarRendimento() {
        this.saldo *= this.taxa;
    }
}