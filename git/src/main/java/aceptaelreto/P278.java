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
public class P278 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 0; i < numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba() {
        // Aqui metemos el codigo de cada caso de prueba

        String[] dias, tiempo;
        String a;
        long resultado, resultado2;
        boolean prueba;

        a = entrada.next();

        dias = a.split(":");
        resultado = Long.parseLong(dias[0]) * 86400;
        resultado += Long.parseLong(dias[1]) * 3600;
        resultado += Long.parseLong(dias[2]) * 60;
        resultado += Long.parseLong(dias[3]);

        resultado2 = 0L;

        while (true) {
            a = entrada.next();
            tiempo = a.split(":");
            resultado2 += Long.parseLong(tiempo[0]) * 3600;
            resultado2 += Long.parseLong(tiempo[1]) * 60;
            resultado2 += Long.parseLong(tiempo[2]);
            prueba = resultado2 < resultado;
            if (tiempo[0].equals("00") && tiempo[1].equals("00") && tiempo[2].equals("00")) {
                break;
            }
        }
        System.out.println((prueba) ? "SI" : "NO");

    }
}
