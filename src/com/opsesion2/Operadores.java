package com.opsesion2;

public class Operadores {
    public static void main(String[] args) {
        //aritmeticos

        int numero1 = 10;
        int numero2 = 20;

        int resultadoSuma = numero1 + numero2;

        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + 5.77);

        int resultadoResta = numero1 - numero2;


        /*
           comparacion:
           > mayor que
           < menor que
           >= mayor igual que
           <= menor igual que
         */

        boolean respuesta = numero1 > numero2;//false
        boolean respuesta1 = numero1 < numero2;//true
        /*
        Logicos
        and &&
        or ||
         */
        boolean resultado3 = numero1 > 5 && numero1 < 30;
        int edad = 17;
        boolean carnetJoven = edad >= 15 && edad <= 27;


    }
}
