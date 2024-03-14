package Ejercicio4.src.operaciones;

import java.util.ArrayList;

public class Matematicas {

    //34 ¿Qué es un algoritmo?
    // Un algoritmo es un conjunto finito y ordenado de instrucciones o pasos que,
    // cuando se siguen sistemáticamente, conducen a la solución de un problema o a la realización de una tarea.

    //35 Algoritmos en java
    public static class SumaIterativa {
        public static int sumaIterativa(int n) {
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                suma += i;
            }
            return suma;
        }
        
        public static void main(String[] args) {
            int n = 10; // Ejemplo con los primeros 10 números naturales
            System.out.println("La suma de los primeros " + n + " números naturales es: " + sumaIterativa(n));
        }
    }
    public static class SumaRecursiva {
        public static int sumaRecursiva(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n + sumaRecursiva(n - 1);
            }
        }
        
        public static void main(String[] args) {
            int n = 10; // Ejemplo con los primeros 10 números naturales
            System.out.println("La suma de los primeros " + n + " números naturales es: " + sumaRecursiva(n));
        }
    }
    


    //36 
    //f(n) es O(g(n)) si y solo si existe un número real positivo c y un número entero no negativo n0 tal que:
    //lim cuando n->infinito de f(n)/g(n) < infinito

    //37
    //es 0(1) ya que el numero de instrucciones es constante

    //38
    //El primer metodo siempre va a devolver el primer elemento por lo que la complejidad es 0(1)
    //El segundo elemento realiza una unica operacion tambien, por lo que tambien es 0(1)

    //39
    //Los 2 metodos de java y C son de complejidad 0(n)

    //40
    public static int pares1(int n) //Apartado 7 del ejercicio 11
    {
        int acumuladoS = 0;
        for(int i = 2; i <= n; i += 2)
        {
            acumuladoS+=i;

        }
        return acumuladoS;
    }


    //41
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int resultado = suma(n);
        System.out.println("La suma de los números desde 0 hasta " + n + " es: " + resultado);
    }

    //42
    //Puesto que n es la cardinalidad de A. Dado que AxA tendra n * n elementos la complejidad seria de 0(n^2).

    //43
    //La complejidad de ese metodo es de 0(m*n). Esto se debe a que m es el numero de filas de una matriz
    //y n es su numero de columnas. Se emplean 2 bucles para recorrer todos los elementos de la matriz donde suma
    //cada individual al total y esto acaba dando que el numero de interacciones sea proporcional al numero 
    //de elementos de una matriz lo que es m*n.

    //44
    public static boolean search(int e, int[] array){
        for(int i : array){
            if(i == e) return true;
        }
        return false;
    }


    public static String sumaR(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumaR'");
    }


    public static String factorial(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'factorial'");
    }


    //45
    

    //46
    //Complejidad Temporal: O(2^n)
    //Complejidad Espacial: O(n)

    //47
    //Los resultados observados son consistentes con la complejidad temporal del algoritmo y el comportamiento
    //esperado de un algoritmo con complejidad O(n).

    //48
    //Tiene aspceto de 0(n^2), ya que el ritmo al que crece el tiempo es exponencialmente mayor al ritmo de crecimiento de los inputs

    //49
    //Se refiere a la cota superior de el crecimiento de una funcion (T(n)) con respecto a otra (f(n) multiplicada por una constante k)

    //50

    //51
    //1) f(x)=1: Esta es una función constante, independiente del valor de x
    //2) f(x)=x: Esta función es una función lineal, a medida que x crece, f(x) crece también
    //3) f(x)=x^2: Esta función es una función cuadrática, a medida que x crece, f(x) aumenta de forma cuadrática
    //4) f(x)=log2(x): Es una curva que se acerca al eje x a medida que x crece, lo hace de manera más lenta que las funciones lineales o cuadráticas.
    //5) f(x)= 2^x: Esta función es una función exponencial, aumentado exponencialmente cada vez que x crece

    //52
    //Puesto que cada llamada tiene una complejidad de n y puesto que para reducir n a 0 necesita una cantidad de pasos logaritmica
    //entonces su complejidad sera n*log(n).

    //53
    //En el caso de un ArrayList no ordenado, la complejidad en el caso peor de la inserción es O(1)
    //En el caso de un ArrayList ordenado, la complejidad en el caso peor de la inserción sería O(n)

    //54
    //Caso tiempo instruccion 10ms y entrada n=100
    //1. Log(100)= 2 instrucciones * 10 ns = 20 ns
    //2. n=100 instruccioness * 10 ns = 1000 ns
    //3. nlog(n) = 100*log(100) = 200 * 10ns = 2000ns
    //4. n^2 = 100^2 = 1000 * 10 ns = 10000 ns
    //5. n^8 = 100^8 = 100000000 * 10 = 1000000000 ns
    //. 10^n = 10^100 = 10^100 * 10 = 10^101 ns

    ///1. Log(100000)= 5 instrucciones * 10 ns = 50 ns
    //3. nlog(n) = 100000*log(100000) = 500000 * 10ns = 5000000ns
    //4. n^2 = 100000^2 = 10000000000 * 10 ns = 100000000000 ns
    //5. n^8 = 100000^8 = 100000000 * 10 = 1000000000 ns
    //6. 10^n = 10^100000 = 10^100000 * 10 = 10^100001 ns

    //Caso tiempo instruccion 1ms y entrada n=100000
    //1. Log(100000)= 5 instrucciones * 1 ns = 5 ns
    //2. n=100000 instruccioness * 1 ns = 100000 ns
    //3. nlog(n) = 100000*log(100000) = 500000 * 1ns = 500000ns
    //4. n^2 = 100000^2 = 10000000000 * 1 ns = 10000000000 ns
    //5. n^8 = 100000^8 = 100000000 * 1 = 100000000 ns
    //6. 10^n = 10^100000 = 10^100000 * 1 = 10^100000 ns

    //55
    //55
    //Todavía no está completamente resuelto debido a la complejidad exponencial del juego y al gran número de posibles configuraciones del tablero.
}   










        