package com.opsesion2;

public class Funciones {
    public static void main(String[] args) {
        // opcion 1: funcion sin parametros y sin tipo de retorno
        //showMenu();

        // opcion 2: funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);

        // opcion 3 : funcion con parametros y sin tipo de retono
        imprimirSaludo("openBootcamp");

        //opcion 4 : funcion con parametros y con tipo de retorno
        String nombre ="Daniel";
        String apellido = "Diaz";
        String saludo = obtenerSaludo(nombre,apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50,200);
        System.out.println(resultadoSuma);

    }

    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static String obtenerSaludo(String nombre,String apellido){
        return "Buenas tardes " + nombre + " " + apellido;
    }

    private static void imprimirSaludo(String saludo) {
        System.out.println(saludo);
    }

    static  void showMenu(){
        System.out.println("Bienvenidos al E-commerce de zapatillas");
        System.out.println("1- Ver zapatillas");
        System.out.println("2- Comprar zapatilla");
        System.out.println("3- Salir");
    }

    static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas \n 1- Ver zapatillas...";
    }


}
