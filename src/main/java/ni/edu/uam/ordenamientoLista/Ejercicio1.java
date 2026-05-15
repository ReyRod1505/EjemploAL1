package ni.edu.uam.ordenamientoLista;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(45);
        numeros.add(12);
        numeros.add(78);
        numeros.add(3);
        numeros.add(25);

        Collections.sort(numeros);

        JOptionPane.showMessageDialog(
                null,
                "Números ordenados:\n" + numeros
        );
    }
}
