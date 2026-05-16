package ni.edu.uam.ordenamientoLista;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Carlos");
        nombres.add("Maria");
        nombres.add("Andres");
        nombres.add("Lucia");
        nombres.add("Pedro");

        Collections.sort(nombres);

        JOptionPane.showMessageDialog(
                null,
                "Nombres ordenados:\n" + nombres
        );
    }
}