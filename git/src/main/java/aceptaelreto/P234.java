/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Guiller
 */
public class P234 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba() {
        // Aqui metemos el codigo de cada caso de prueba
        int minVoltaje, nPilas, fin, inicio, cont;
        int[] vPila;

        nPilas = entrada.nextInt();
        minVoltaje = entrada.nextInt();
        vPila = new int[nPilas];
        for (int i = 0; i < nPilas; i++) {
            vPila[i] = entrada.nextInt();
        }

        Arrays.sort(vPila);
        cont = inicio = 0;
        fin = nPilas - 1;
        while (inicio < fin) {
            if (vPila[inicio] + vPila[fin] >= minVoltaje) {
                fin--;
                cont++;
            }
            inicio++;
        }
        System.out.println(cont);
    }
}
