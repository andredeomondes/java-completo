package entities;

import java.util.*;

public class Teacher {
    String name;
    int code;
    private Set<Course> courses;


    public Teacher(String name, int code) {
        this.name = name;
        this.code = code;
        this.courses = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public int totalUniqueStudents() {
        // Usando um Set para garantir que os alunos sejam únicos
        Set<Students> uniqueStudents = new HashSet<>(); // Armazenar alunos únicos
        for (Course c : courses) { // Iterar sobre os cursos do professor
            uniqueStudents.addAll(c.getStudents()); // Adicionar todos os alunos do curso ao Set
        }
        return uniqueStudents.size(); //
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(code, teacher.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", courses=" + courses +
                '}';
    }
}