package actividadwhilealexrios66668;

import java.util.Scanner;

public class ActividadWhileAlexRios66668 {

    public static void Datos() {
        System.out.println("Alex Omar Ríos Pérez");
        System.out.println("Matricula: 66668");
        System.out.println("Ingeniería en Sistemas Computacionales");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Capus V");
    }

    public static void space() {
        System.out.println(" ");
    }

    public static void frontera() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    public static void Actividad4_1While() {
        System.out.println("Actividad 4.1  Calcular el factorial de 10 con While");

        int factorial = 1;
        int c = 0;
        while (c < 10) {
            c++;
            factorial = factorial * c;

        }
        System.out.println("El Factorial de 10 es: " + factorial);
    }
    public static void Actividad4_2While() {
        
        System.out.println("Actividad 4.2 // Media");
        
        int us = 0;
        System.out.println("Ingresa un valor");
        Scanner tecla = new Scanner (System.in);
        us = tecla.nextInt ( );
        
        int suma = 0;
        int media = 0;
        int v1 = 0;
        while (v1 < us) {
            v1++;
            suma = suma + v1;
            media = suma / us;
        }
        System.out.println(media);
    }
    public static void Actividad4_3While() {
        
        System.out.println("Actividad 4.3 // Suma, promedio, mayor o menor y distancia numérica de usuario");
        
        System.out.print("Introduce tu primer valor: ");
        int valor2 = 0;
        Scanner usuario2 = new Scanner (System.in);
        valor2 = usuario2.nextInt ( );
        
        System.out.print("Introduce tu segundo valor: ");
        int valor3 = 0;
        Scanner usuario3 = new Scanner (System.in);
        valor3 = usuario3.nextInt ( );
        
        int suma = valor2 + valor3;
        System.out.println("La suma de " + valor2 + "  más " + valor3 + " es " + suma);
        
        int promedio = suma / 2;
        
        System.out.println("Promedio es: " + promedio);
        
        if (valor2 > valor3) {
            System.out.println(valor2 + " es mayor que " + valor3);
        }if (valor3 > valor2) {
            System.out.println(valor3 + " es mayor que " + valor2);
        }if (valor2 == valor3) {
            System.out.println("Tus valores son iguales");
        }
       
        if (valor2 < valor3) {
            System.out.println("La distancia numerica: ");
            int d = valor2;
        while (d < valor3) {
            d++;
            System.out.println(d);
            
          }
        }if (valor3 < valor2) {
            System.out.println("Distancia numerica: ");
            int e = valor3;
            while (e  < valor2) {
                e++;
                System.out.println(e);
        }
        }

    }

    public static void main(String[] args) {
        
        System.out.println("Para ver cada una de las actividades ingresa un numero entre el 1 y el 3");
        
        int v1 = 0;
        System.out.print("Ingresa el numero de la actividad: ");
        Scanner us = new Scanner ( System.in);
        v1 = us.nextInt( );
        
        switch (v1) {
            case 1:
                Actividad4_1While( );
                space ( );
                frontera ( );
                space ( );
                Datos ( );
                frontera ( );
                break;
            case 2:
                Actividad4_2While( );
                space ( );
                frontera ( );
                space ( );
                Datos ( );
                frontera ( );
                break;
            case 3 :
                Actividad4_3While( );
                space ( );
                frontera ( );
                space ( );
                Datos ( );
                frontera ( );
                break;
            default:
                System.out.println("No aplica");
        }

    }

}
