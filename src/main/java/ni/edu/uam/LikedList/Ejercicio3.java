package ni.edu.uam.LikedList;

import java.util.LinkedList;
import javax.swing.JOptionPane;


public class Ejercicio3 {
    public static void main(String[] args) {

        LinkedList<String> productos = new LinkedList<>();

        productos.add("Laptop");
        productos.add("Mouse");
        productos.add("Teclado");
        productos.add("Monitor");

        JOptionPane.showMessageDialog(
                null,
                "Productos actuales:\n" + productos
        );

        String eliminar = JOptionPane.showInputDialog(
                "Ingrese el producto que desea eliminar:"
        );

        productos.remove(eliminar);

        JOptionPane.showMessageDialog(
                null,
                "Lista actualizada:\n" + productos
        );
    }
}
