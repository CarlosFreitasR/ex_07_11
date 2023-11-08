package dev.senzalla.federal;

public class PessoaJuridica extends Contribuinte{
    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        return super.getRendaBruta() * 0.10;
    }
}
