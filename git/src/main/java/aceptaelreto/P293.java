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
public class P293 {

    static java.util.Scanner entrada;
    public static int[] num = new int[5];
    public static String[] patas = new String[5];

    public static void main(String args[]) {

        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba() {
        int resultado = 0;
        String pata = "";

        pata = entrada.nextLine();
        patas = pata.split(" ");
        for (int j = 0; j < 5; j++) {
            num[j] = Integer.parseInt(patas[j]);
        }
        resultado = 6 * num[0] + 8 * num[1] + 10 * num[2] + 2 * num[3] * num[4];
        System.out.println(resultado);
    }
}
