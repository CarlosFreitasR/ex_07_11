package dev.senzalla.federal;

public class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        if (super.getRendaBruta() <= 1400) {
            return 0;
        } else if (super.getRendaBruta() <= 2100) {
            return (super.getRendaBruta() - 1400) * 0.10 - 100;
        } else if (super.getRendaBruta() <= 2800) {
            return (super.getRendaBruta() - 2100) * 0.15 - 270;
        } else if (super.getRendaBruta() <= 3600) {
            return (super.getRendaBruta() - 2800) * 0.25 - 500;
        } else {
            return (super.getRendaBruta() - 3600) * 0.30 - 700;
        }
    }
}
