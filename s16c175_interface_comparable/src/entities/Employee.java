package entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    // Implementação do metodo compareTo para comparar pelo nome
    public int compareTo(Employee other) {

        return name.compareTo(other.getName()); // Aqui estamos comparando os nomes dos funcionários
        /*
         return salary.compareTo(other.getSalary()); // Aqui estamos comparando os salários dos funcionários em ordem crescente
         return - salary.compareTo(other.getSalary()); // Aqui estamos comparando os salários dos funcionários em ordem decrescente
         */

    }
}
