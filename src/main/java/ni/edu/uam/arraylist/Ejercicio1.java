package ni.edu.uam.arraylist;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(40);
        numeros.add(54);
        numeros.add(24);
        numeros.add(52);

        System.out.println("Lista de números:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}