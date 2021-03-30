/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

import java.util.Arrays;

/**
 *
 * @author Guiller
 */
public class P419 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int pesoMax, pasajeros, viajes, numMayor, numMenor;
        int[] pesos;
        pesoMax = entrada.nextInt();
        pasajeros = entrada.nextInt();
        if (pesoMax == 0 && pasajeros == 0) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida
        pesos = new int[pasajeros];
        for (int j = 0; j < pasajeros; j++) {
            pesos[j] = entrada.nextInt();
        }
        Arrays.sort(pesos);
        numMayor = pasajeros - 1;
        viajes = numMenor = 0;

        while (numMenor <= numMayor) {
            if (numMenor == numMayor) {
                viajes++;
                numMenor++;
                numMayor--;
            } else if (pesos[numMenor] + pesos[numMayor] <= pesoMax) {
                numMayor--;
                viajes++;
                numMenor++;
            } else {
                viajes++;
                numMayor--;
            }
        }
        System.out.println(viajes);
        return true;
    }
}
