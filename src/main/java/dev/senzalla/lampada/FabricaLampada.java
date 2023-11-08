package dev.senzalla.lampada;

public class FabricaLampada {
    static class Incandescente implements Lampada {
        @Override
        public void ligar() {
            System.out.println("Lâmpada Incandescente ligada.");
        }

        @Override
        public void desligar() {
            System.out.println("Lâmpada Incandescente desligada.");
        }
    }

    static class Fluorescente implements Lampada {
        @Override
        public void ligar() {
            System.out.println("Lâmpada Fluorescente ligada.");
        }

        @Override
        public void desligar() {
            System.out.println("Lâmpada Fluorescente desligada.");
        }
    }

    public static Lampada construir(String tipo) {
        if ("Incandescente".equalsIgnoreCase(tipo)) {
            return new Incandescente();
        } else if ("Fluorescente".equalsIgnoreCase(tipo)) {
            return new Fluorescente();
        } else {
            return null;
        }
    }
}
