package com.opsesion2;

/*
 Laa sobrecarga permite duplicar un metodo siempre y cuando tengan diferente numero/tipo parametros.
 */

public class Sobrecarga {
    public static void main(String[] args) {
        //Funcion anonima
        //() -> System.out.println("");
    }
    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    private static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }
}
