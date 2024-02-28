import java.util.Scanner;
public class numeroRandom {
    public static void main (String [] args) {
        Scanner cargaDeDatos = new Scanner(System.in);
            System.out.println("Adivina un numero entre 1 - 100");
                int numeroDeUsuario = cargaDeDatos.nextInt();
                int min = 1;
                    int max = 100;
                        int randomInt = (int) (Math.random() * (max - min +1)) + min;
                            System.out.println(randomInt);
    }
}
