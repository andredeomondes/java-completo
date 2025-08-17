package entities;

public class Person {
    String name;
    char gender;
    double height;

    // Construtores ----------------------------------------------------------
    public Person() {
    }

    public Person(String name, char gender, double height) {
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    // Getter e Setter ----------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return
                name + " | " + gender + " | " + height;

    }
}
