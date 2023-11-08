package dev.senzalla;

public class Main {
    public static void main(String[] args) {
        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = new PessoaJuridica("Empresa 1", 50000);
        contribuintes[1] = new PessoaJuridica("Empresa 2", 80000);
        contribuintes[2] = new PessoaJuridica("Empresa 3", 120000);
        contribuintes[3] = new PessoaFisica("Pessoa 1", 1000);
        contribuintes[4] = new PessoaFisica("Pessoa 2", 1800);
        contribuintes[5] = new PessoaFisica("Pessoa 3", 2500);

        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            System.out.println(contribuinte.getNome() + ": Imposto a ser pago = R$ " + String.format("%.2f", imposto));
        }
    }
}