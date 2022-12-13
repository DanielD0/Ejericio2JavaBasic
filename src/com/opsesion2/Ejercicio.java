package com.opsesion2;

public class Ejercicio {
    public static void main(String[] args) {
        double total = precioTotal(49.9);
        System.out.println(total);
    }

    private static double precioTotal(double precio) {
        return precio + (precio * 0.16);
    }
    /*
    Crear una funcion que reciba el precio y devuelva el precio con el IVA incluido
     */
}
