package application;
import entities.*;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta(1, 10000);
        Conta conta2 = new Conta(2, 20000);

        ContaEspecial contaesp1 = new ContaEspecial(1, 12000, 50000);
        ContaInvestimento containv1 = new ContaInvestimento(1, 11000, 1.01, 12);

        System.out.println("Numero conta especial: " + contaesp1.getNumero() + " e o limite da conta é: " + contaesp1.getLimite());
        System.out.println("Numero da conta investimento: " + containv1.getNumero() + " e o prazo é de: " + containv1.getPrazo() + " meses.");

    }
}