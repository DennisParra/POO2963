package ec.edu.espe.demo.rest;

import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.util.Person;

@RestController
@RequestMapping("api/demo")
public class DemoRestController {

    @GetMapping
    public String hello() {
        return "HOLA MUNDO, SOY EL SERVICIO REST";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "ADIOOOOOS!!";
    }

    @GetMapping(value = "/callme/{name}/{age}/{dni}")
    public Person name(@PathVariable String name, @PathVariable int age, @PathVariable String dni) {

        String a = ValidarCedula(dni);
        return new Person(name, age, a);

    }

    public static String ValidarCedula(@PathVariable String dni) {
        Scanner lec = new Scanner(System.in);

        int c, suma = 0, acum, resta = 0;

        for (int i = 0; i < dni.length() - 1; i++) {
            c = Integer.parseInt(dni.charAt(i) + "");
            if (i % 2 == 0) {
                c = c * 2;
                if (c > 9) {
                    c = c - 9;
                }
            }

            suma = suma + c;
        }

        if (suma % 10 != 0) {
            acum = ((suma / 10) + 1) * 10;
            resta = acum - suma;
        }

        int ultimo = Integer.parseInt(dni.charAt(9) + "");

        if (ultimo == resta) {
            return ("La cedula es correcta");
        } else {
            return ("La cedula es incorrecta");
        }

    }

}