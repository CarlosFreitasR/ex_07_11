package dev.senzalla.lampada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Qual tipo de lâmpada você deseja construir (Incandescente/Fluorescente)?");
        String escolha = "Incandescente";

        Lampada lampada = FabricaLampada.construir(escolha);

        if (lampada != null) {
            lampada.ligar();
            lampada.desligar();
        } else {
            System.out.println("Tipo de lâmpada inválido.");
        }
    }
}
