package ni.edu.uam.LikedList;
import java.util.LinkedList;

public class Ejercicio1 {

    public static void main(String[] args) {

            // Crear el LinkedList
            LinkedList<Integer> numeros = new LinkedList<>();

            // Agregar elementos
            numeros.add(10);
            numeros.add(20);
            numeros.add(30);
            numeros.add(40);
            numeros.add(50);

            // Mostrar todos los elementos
            System.out.println("Elementos del LinkedList:");

            for (Integer numero : numeros) {
                System.out.println(numero);
            }
        }

}
