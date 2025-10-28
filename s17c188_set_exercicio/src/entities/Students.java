package entities;

import java.util.Objects;

public class Students {
    String name;
    int code;

    public Students(String name, int code) {
        this.name = name;
        this.code = code;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(code, students.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
