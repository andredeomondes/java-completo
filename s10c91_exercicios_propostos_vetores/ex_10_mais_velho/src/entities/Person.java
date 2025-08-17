package entities;

public class Person {
    public String name;
    public int age;

    // Construtores ---------------------------------------------------------------]
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters e Setters ---------------------------------------------------------------]

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
}
