package ni.edu.uam.arraylist;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Josue");
        estudiantes.add("Reynolds");
        estudiantes.add("Blanca");

        estudiantes.remove("Blanca");

        System.out.println("Lista actualizada de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}