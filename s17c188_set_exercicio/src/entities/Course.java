package entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    Teacher teacher;
    String name;
    Set<Students> students;

    public Course(Teacher teacher, String name) {
        this.teacher = teacher;
        this.name = name;
        this.students = new HashSet<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Students> getStudents() {
        return students;
    }

    public void setStudents(Set<Students> students) {
        this.students = students;
    }

    public void addStudent(Students s) {
        students.add(s);
    }

}
