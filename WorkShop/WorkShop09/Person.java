public class Person {

    private String name;
    private int age;
    private float dni;

    public Person() {

    }

    public Person(String name, int age, float dni) {
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

    public float getDni() {
        return dni;
    }

    public void setDni(float dni) {
        this.dni = dni;
    }

}