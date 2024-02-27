import java.util.Scanner;
public class CLC {
    public static void main (String [] args) {
        Scanner cargaDeDatos = new Scanner(System.in);

        System.out.println("Ingresa la edad de tu perro en años");
        Integer edadCanina = cargaDeDatos.nextInt();
        Integer edadFinal = (edadCanina * 7);
        System.out.println("La edad de tu perro sería " + edadFinal );
    }

}
