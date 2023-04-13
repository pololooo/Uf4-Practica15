package uf4.practica15;

import java.util.*;

public class Uf4Practica15 {

    public static void main(String[] args) {
        
    }
    
}
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarallaEspanyola {
    private List<Carta> cartes;

    public BarallaEspanyola() {
        cartes = new ArrayList<>();
        // Afegeix totes les cartes a la baralla espanyola
        for (int i = 1; i <= 12; i++) {
            cartes.add(new Carta(i, "bastos"));
            cartes.add(new Carta(i, "espases"));
            cartes.add(new Carta(i, "copes"));
            if (i < 8) {
                cartes.add(new Carta(i, "ors"));
            }
        }
    }

    public void barrejar() {
        Collections.shuffle(cartes);
    }

    public Carta seguentCarta() {
        return cartes.remove(0);
    }

    public int cartesDisponibles() {
        return cartes.size();
    }

    public void demanarCartes(int n, Jugador jugador) {
        List<Carta> cartesDemanades = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Carta carta = seguentCarta();
            cartesDemanades.add(carta);
        }
        jugador.afegirCartes(cartesDemanades);
    }

    public void repartirCartes(int n) {
        for (int i = 0; i < n; i++) {
            for (Jugador jugador : jugadors) {
                demanarCartes(1, jugador);
            }
        }
    }

    public void veureMunt() {
        for (Carta carta : cartes) {
            System.out.println(carta.getNumero() + " de " + carta.getPalo());
        }
    }
}

public class Jugador {
    private List<Carta> cartes;

    public Jugador() {
        cartes = new ArrayList<>();
    }

    public void demanarCartes(int n) {
        baralla.demanarCartes(n, this);
    }

    public void repartirCartes(int n) {
        baralla.repartirCartes(n);
    }

    public List<Carta> getCartes() {
        return cartes;
    }

    public void afegirCartes(List<Carta> cartesNoves) {
        cartes.addAll(cartesNoves);
    }
}

public class Carta {
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }
}
*/
