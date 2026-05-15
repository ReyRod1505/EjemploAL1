package ni.edu.uam.arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> productos = new ArrayList<>();

        System.out.print("¿Cuántos productos desea registrar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String producto = scanner.nextLine();

            productos.add(producto);
        }
        System.out.println("\nProductos registrados:");

        for (String producto : productos) {
            System.out.println(producto);
        }
        System.out.println("\nCantidad de productos registrados: " + productos.size());
        scanner.close();
    }
}