package ni.edu.uam.LikedList;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Crear LinkedList de nombres
        LinkedList<String> nombres = new LinkedList<>();

        // Agregar nombres iniciales
        nombres.add("Carlos");
        nombres.add("Maria");
        nombres.add("Jose");

        // Pedir nombre para el inicio
        String inicio = JOptionPane.showInputDialog(
                "Ingrese un nombre para agregar al inicio:");

        // Pedir nombre para el final
        String fin = JOptionPane.showInputDialog(
                "Ingrese un nombre para agregar al final:");


        nombres.addFirst(inicio);
        nombres.addLast(fin);


        JOptionPane.showMessageDialog(
                null,
                "Lista de nombres:\n" + nombres
        );
    }
}
