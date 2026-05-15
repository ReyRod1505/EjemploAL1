package ni.edu.uam.ordenacionLista;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(45);
        numeros.add(133);
        numeros.add(48);
        numeros.add(21);
        numeros.add(39);

        Collections.sort(numeros);

        System.out.println("Números ordenados de menor a mayor:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
