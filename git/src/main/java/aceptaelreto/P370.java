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
public class P370 {

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
        int a, b;
        String datos;

        datos = entrada.nextLine();
        a = Integer.parseInt(datos.substring(0, datos.indexOf("-")));
        b = Integer.parseInt(datos.substring(datos.indexOf("-") + 1));

        if (a > b) {
            if (a - b != 1) {
                System.out.println("NO");
                return;
            }
            if (b % 2 == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } else {
            if (b - a != 1) {
                System.out.println("NO");
                return;
            }
            if (a % 2 == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
