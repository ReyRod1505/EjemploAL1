package ni.edu.uam.ordenamientoLista;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Ejercicio3 {
        public static void main(String[] args) {

            ArrayList<Integer> numeros = new ArrayList<>();

            numeros.add(15);
            numeros.add(8);
            numeros.add(42);
            numeros.add(3);
            numeros.add(27);

            JOptionPane.showMessageDialog(
                    null,
                    "Lista sin ordenar:\n" + numeros
            );

            numeros.sort(Collections.reverseOrder());

            JOptionPane.showMessageDialog(
                    null,
                    "Lista ordenada de forma descendente:\n" + numeros
            );
        }
}
