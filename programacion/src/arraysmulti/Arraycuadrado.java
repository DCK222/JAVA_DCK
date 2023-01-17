package arraysmulti;

import java.util.Scanner;

public class Arraycuadrado {

    public static void main(String[] args) {
        // Declarar e inicializar el array de números primos
        int[] primos = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };

        // Declarar e inicializar la matriz que almacenará los resultados
        int[][] matrizNumerica = new int[3][4];

        // Generar valores aleatorios y calcular el cuadrado y el cubo de cada uno
        for (int i = 0; i < matrizNumerica.length; i++) {
            for (int j = 0; j < matrizNumerica[i].length; j++) {
                matrizNumerica[0][j] = (int) (Math.random() * 10);
                matrizNumerica[1][j] = (int) (Math.pow(matrizNumerica[0][j], 2));
                matrizNumerica[2][j] = (int) (Math.pow(matrizNumerica[0][j], 3));
            }
        }

        // Imprimir la matriz
        imprimeMatriz(matrizNumerica);
    }

    // Método para imprimir la matriz
    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%-5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}


