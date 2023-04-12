package uf4.practica15;

public class Carta {

    private String pal;
    private int valor;

    public Carta(String pal, int valor) {
        this.pal = pal;
        this.valor = valor;
    }

    public String getPal() {
        return pal;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + pal;
    }
}
