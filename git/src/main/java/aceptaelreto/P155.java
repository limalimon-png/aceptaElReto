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
public class P155 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int x, y;

        x = entrada.nextInt();
        y = entrada.nextInt();
        if (x < 0 || y < 0) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida
        System.out.println((x + y) * 2);
        return true;
    }
}
