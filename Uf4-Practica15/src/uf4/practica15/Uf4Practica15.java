package uf4.practica15;

public class Uf4Practica15 {

    public static void main(String[] args) {
        
    }
    
}
/*
public class Carta {
  private String pal;
  private int numero;

  public Carta(String pal, int numero) {
    this.pal = pal;
    this.numero = numero;
  }

  public String getPal() {
    return pal;
  }

  public int getNumero() {
    return numero;
  }

  public String toString() {
    return numero + " de " + pal;
  }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralla {
  private List<Carta> cartes;

  public Baralla() {
    cartes = new ArrayList<Carta>();
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
    if (cartes.size() == 0) {
      System.out.println("No queden més cartes.");
      return null;
    }
    Carta carta = cartes.remove(0);
    return carta;
  }

  public int cartesDisponibles() {
    return cartes.size();
  }

  public List<Carta> demanarCartes(int numCartes) {
    List<Carta> cartesJugador = new ArrayList<Carta>();
    if (numCartes > cartes.size()) {
      System.out.println("No hi ha suficients cartes.");
      return cartesJugador;
    }
    for (int i = 0; i < numCartes; i++) {
      Carta carta = seguentCarta();
      if (carta != null) {
        cartesJugador.add(carta);
      }
    }
    return cartesJugador;
  }

  public List<Carta> repartirCartes(int numCartes


+---------------+       +---------------+        +---------------+
|      Carta    |       |    Baralla    |        |     Jugador   |
+---------------+       +---------------+        +---------------+
| - pal         |       | - cartes      |        | - nom         |
| - numero      |       | - barrejar()  |        | - cartes      |
+---------------+       | - seguent()   |        | - demanar()   |
                         | - disponibles()|        | - rebre()     |
                         | - repartir()  |        | - veure_cartes|
                         | - veureMunt() |        +---------------+
                         +---------------+

*/