package ec.edu.espe.demo.util;

public class Person {
    private String name;
    private int age;
    private int dni;

    public Person() {

    }

    public Person(String name, int age, int dni) {
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}