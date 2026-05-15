package ni.edu.uam.ordenacionLista;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(15);
        numeros.add(80);
        numeros.add(25);
        numeros.add(5);
        numeros.add(60);
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Números ordenados de mayor a menor:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}