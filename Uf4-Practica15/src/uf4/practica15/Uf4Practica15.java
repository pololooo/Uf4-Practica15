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

public class Baralla {
    private List<Carta> cartes;
    private List<Carta> cartesRetornades;

    public Baralla() {
        cartes = new ArrayList<>();
        cartesRetornades = new ArrayList<>();
        String[] pals = {"oros", "copes", "espases", "bastos"};
        for (String pal : pals) {
            for (int i = 1; i <= 12; i++) {
                cartes.add(new Carta(pal, i));
            }
        }
    }

    public void barrejar() {
        Collections.shuffle(cartes);
    }

    public Carta seguentCarta() {
        if (cartes.isEmpty()) {
            System.out.println("No queden més cartes.");
            return null;
        }
        Carta carta = cartes.remove(0);
        cartesRetornades.add(carta);
        return carta;
    }

    public int cartesDisponibles() {
        return cartes.size();
    }

    public List<Carta> demanarCartes(int numCartes) {
        if (cartes.size() < numCartes) {
            System.out.println("No hi ha prou cartes.");
            return null;
        }
        List<Carta> cartesDemanades = new ArrayList<>();
        for (int i = 0; i < numCartes; i++) {
            Carta carta = seguentCarta();
            if (carta == null) {
                break;
            }
            cartesDemanades.add(carta);
        }
        return cartesDemanades;
    }

    public void repartirCartes(int numCartes) {
        if (cartes.size() < numCartes) {
            System.out.println("No hi ha prou cartes.");
            return;
        }
        for (int i = 0; i < numCartes; i++) {
            Carta carta = seguentCarta();
            if (carta == null) {
                break;
            }
            System.out.println("Carta repartida: " + carta);
        }
    }

    public void veureMunt() {
        System.out.println("Cartes retornades:");
        for (Carta carta : cartesRetornades) {
            System.out.println(carta);
        }
    }
}

*/