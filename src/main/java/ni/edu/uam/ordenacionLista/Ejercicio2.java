package ni.edu.uam.ordenacionLista;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Pedro");

        Collections.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
