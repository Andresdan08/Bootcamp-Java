import java.util.Scanner;
public class CDD {
    public static void main(String [] args) {
        Scanner cargaDeDatos = new Scanner(System.in);
            System.out.println("Ingrese el precio del producto");
                double precioBase = cargaDeDatos.nextDouble();
                    System.out.println("Ingrese el % de descuento");
                        double descuentoBase = cargaDeDatos.nextDouble();
                            double montoConDescuento = precioBase * (descuentoBase / 100);
                                double precioFinal = precioBase - montoConDescuento;
                                    System.out.println("Este es el precio final del producto.  $" + precioFinal);
    }
}
