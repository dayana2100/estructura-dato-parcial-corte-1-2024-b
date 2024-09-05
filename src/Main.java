
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String nombreproducto;
        Integer valorproducto;
        Integer cantidad;
        Integer valorneto;
        Double descuento5;
        Double descuento7;
        Double valordescuento;
        String mensaje = "Error en la entrada de datos";

        System.out.print("Ingrese nombre del cliente");
        nombre = scanner.next();
        System.out.print("Ingrese nombre del producto");
        nombreproducto = scanner.next();
        System.out.println("Ingrese costo de la unidad");
        valorproducto = scanner.nextInt();
        if (valorproducto > 0) {
            System.out.println("Ingrese la cantidad a comprar");
            cantidad = scanner.nextInt();
            valorneto = cantidad * valorproducto;
            valorneto = scanner.nextInt();
            if (cantidad > 0) {
                if (cantidad > 10) {
                    System.out.println("No tiene descuento");
                } else if (cantidad > 10 && cantidad < 20) {
                    descuento5 = valorneto * 0.05 - valorneto;
                    descuento5 = scanner.nextDouble();
                    System.out.println(nombre + "su total con descuento fue de " + descuento5);
                }
                else if (cantidad > 20) {
                    descuento7 = valorneto * 0.07 - valorneto;
                    descuento7 = scanner.nextDouble();
                    System.out.println(nombre + "su total con descuento fue de " + descuento7);
                }

        } else {
            System.out.println(mensaje);
        }

        } else {
            System.out.println(mensaje);
        }
            }


