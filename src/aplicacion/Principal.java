package Ejercicio4.src.aplicacion;

import java.lang.management.OperatingSystemMXBean;

import Ejercicio4.src.operaciones.Matematicas;

public class Principal {
    public static void main(String[] args) {
        
        System.out.println("34) La suma de los 10 primeros numeros es: " + Matematicas.suma(10));
        System.out.println("34.2) La suma de los 5 primeros numeros es: " + Matematicas.sumaR(10));
        System.out.println("40) El facotial de 5 es: " + Matematicas.factorial(5));
    }
}

