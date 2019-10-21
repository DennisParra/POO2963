import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {

        Scanner scn = new Scanner(System.in);

        ArrayList<Person> list = new ArrayList<Person>();

        while (true) {
            System.out.println("Ingrese el nombre, edad y DNI: ");
            String aux = scn.nextLine();

            String[] vector = aux.split(" ");
            // vector[0] = "Dennis"
            // vector[1] = "22"
            // vector[2] = "Sangolqui"

            if (aux.equals("")) {
                break;
            }

            String name = vector[0];
            int age = Integer.parseInt(vector[1]);
            String dni = vector[2];

            Person person = new Person(name, age, dni);

            list.add(person);

        }

        System.out.println("\n\nImpresion con for each: ");
        for (Person aux : list) {
            System.out.println(aux.getName() + " - " + aux.getAge() + " - " + aux.getDni());
        }
    }

}
