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
public class P119 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int soldados, n, escudosTotales;
        StringBuilder respuesta = new StringBuilder("");

        soldados = entrada.nextInt();

        if (soldados == 0) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida
        escudosTotales = 0;
        while (soldados != 0) {
            n = (int) Math.sqrt(soldados);
            escudosTotales = escudosTotales + ((4 * 3) + (n - 2) * 4 * 2 + (n - 2) * (n - 2));
            soldados = soldados - (int) Math.pow(n, 2);
        }
        respuesta.append(escudosTotales + "\n");
        System.out.print(respuesta);
        return true;
    }
}
