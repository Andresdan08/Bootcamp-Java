//Aquí importamos la variable "Scanner"
import java.util.Scanner;
//Todo comienza como "public class main"
//Adicional abres con corchete y luego declaras el "public static void main"
public class Main {
    public static void main (String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        // Calculadora de masa corporal -> Peso en KG / Altura <-- Al cuadrado 2
        System.out.println("Indique su peso en KG");
        double peso = cargaDeDatos.nextDouble();

        System.out.println("Indique su altura en Mts");
        double altura = cargaDeDatos.nextDouble();

        double indiceDeMasaCorporal = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es " + indiceDeMasaCorporal);

        //Mayor a 30 -> Obesidad
        if (indiceDeMasaCorporal >= 30) {
            System.out.println("Presenta obesidad");
        }
        //Entre 25 y 30 sobrepeso
        if (indiceDeMasaCorporal >= 25 && indiceDeMasaCorporal < 30) {
            System.out.println("Presentas Sobrepeso");
        }
        //Entre 18.5 y 25 Normal
        if (indiceDeMasaCorporal >= 18.5 && indiceDeMasaCorporal < 25) {
            System.out.println("Estas en tu indice normal");
        }
        //Menor a 18.6 debajo del normal
        if (indiceDeMasaCorporal < 18.6) {
            System.out.println("Estas por debajo de lo normal");
        }

        /*
        System.out.println("¿Qué edad tienes?");
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();

        // if significa "Si"
        if (edad >= 18) {
           System.out.println("Es mayor de edad");
           // else significa "o"
        } else {
            System.out.println("Es menor de edad");
        }
         */
    }
}