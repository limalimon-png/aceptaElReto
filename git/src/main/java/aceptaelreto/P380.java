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
public class P380 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int n, suma;
        String datos;
        String[] cosos;
        int[] gastos;

        n = entrada.nextInt();

        if (n == 0) { // CASO DE SALIDA
            return false;
        }

        entrada.nextLine();
        datos = entrada.nextLine();
        cosos = datos.split(" ");
        gastos = new int[n];
        suma = 0;
        for (int i = 0; i < n; i++) {
            suma += gastos[i] = Integer.parseInt(cosos[i]);
        }

        System.out.println(suma);
        return true;
    }
}
