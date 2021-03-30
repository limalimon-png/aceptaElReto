/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto;

/**
 *
 * @author Guiller
 */
public class P245 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {

        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        long n, dalton = 0, otros, cont = 0;
        byte p = 0;

        n = entrada.nextLong();
        if (n == 0) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida

        for (int i = 0; i < n; i++) {
            otros = entrada.nextLong();
            if (i == 0) {
                dalton = otros;
            } else {
                if (p > 0) {
                    if (dalton > otros) {
                        dalton = otros;
                    } else {
                        cont++;
                    }
                } else {
                    if (dalton < otros) {
                        dalton = otros;

                    } else {
                        cont++;
                        if (dalton > otros && i == 1) {
                            p++;
                            dalton = otros;
                            p++;
                            cont--;
                        }
                    }
                }
            }
        }

        if (cont == 0) {
            System.out.println("DALTON");
        } else {
            System.out.println("DESCONOCIDOS");
        }

        return true;
    }
}
