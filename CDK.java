import java.util.Scanner;
public class CDK {
    public static void main (String [] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingrese la distancia recorrida en millas");
        Integer millas = cargaDeDatos.nextInt();
        Double recorrido = (millas * 1.60934);
        System.out.println("Recorriste en Km " + recorrido);
    }

}