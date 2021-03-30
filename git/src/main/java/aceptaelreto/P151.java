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
public class P151 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int num, cadena;
        int b;

        num = entrada.nextInt();
        if (num == 0) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida

        entrada.nextLine();
        b = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                cadena = entrada.nextInt();
                if (cadena == 1 && j == i) {
                    b++;
                }
                if (cadena == 1 && j != i) {
                    b--;
                }
            }
        }
        if (num == b) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        return true;
    }
}
