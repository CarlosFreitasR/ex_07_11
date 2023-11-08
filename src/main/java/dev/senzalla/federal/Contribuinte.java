package dev.senzalla.federal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contribuinte {
    private String nome;
    private double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }



    public double calcularImposto() {
        return 0;
    }
}
