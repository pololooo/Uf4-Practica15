package uf4.practica15;

import java.util.*;

public class Uf4Practica15 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        BarallaEspanyola baralla = new BarallaEspanyola();

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("1. Barrejar cartes");
            System.out.println("2. Repartir cartes al jugador");
            System.out.println("3. Mostrar cartes del jugador");
            System.out.println("0. Sortir");
            System.out.print("Introdueix la teva opció: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    baralla.barrejar();
                    System.out.println("Cartes barrejades");
                    break;
                case 2:
                    System.out.print("Quantes cartes vols repartir? ");
                    int n = scan.nextInt();
                    baralla.demanarCartes(n, jugador);
                    System.out.println("Cartes repartides al jugador");
                    break;
                case 3:
                    System.out.println("Cartes del jugador:");
                    for (Carta carta : jugador.getCartes()) {
                        System.out.println(carta.getNumero() + " de " + carta.getPalo());
                    }
                    break;
                case 4:
                    System.out.println("Adéu!");
                    break;
                default:
                    System.out.println("Opció no valida");
                    break;
            }
            System.out.println();
        }
    }
}
