package com.equipo.saludo;

/**
 * SaludoApp
 *
 */
public class App 
{
    public static String saludar(String nombre) {
        return "¡Hola, " + nombre + "!";
    }

    public static void main(String[] args) {
        System.out.println(saludar("DevOps"));
    }
}
