package application;

import entities.Course;
import entities.Students;
import entities.Teacher;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        Em um portal de cursos online, cada usuário possui um código único, representado por
//        um número inteiro.
//
//        Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
//        matricular em quantos cursos quiser.
//
//        Assim, o número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
//        alunos repetidos em mais de um curso.

//        O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
//        Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
//        quantidade total e alunos dele, conforme exemplo.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--------- TEACHER COURSES REGISTRATION ---------");

        // Criando o objeto "Professor"
        System.out.println("Enter teacher data: ");
        System.out.print("Name: ");
        String teacherName = sc.nextLine();
        System.out.print("Code: ");
        int teacherCode = sc.nextInt();
        sc.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherCode);

        System.out.println("------------------------------------------------");
        for (int i = 1; i <= 3; i++) {

            // lendo o nome do curso
            System.out.print("Enter the name of the course [ " + i + " ] : ");
            String course = sc.nextLine();

            // criando o objeto "Curso"
            Course currentCourse = new Course(teacher, course);
            // adicionando o curso ao professor
            teacher.addCourse(currentCourse);

            System.out.println("\n------------------------------------------------");

            // lendo o número de alunos para o curso atual
            System.out.print("[ " + i + " ] How many students for course [ " + course + " ] " + ": ");
            int n = sc.nextInt();
            sc.nextLine();

            System.out.println("------------------------------------------------");

            // lendo os dados dos alunos
            for (int j = 1; j <= n; j++) {

                // lendo o nome e o código do aluno
                System.out.print("Enter student name [ " + j + " ]: ");
                String name = sc.nextLine();
                System.out.print("Enter student code[ " + j + " ]: ");
                int code = sc.nextInt();
                sc.nextLine();
                // adicionando o aluno ao curso atual
                currentCourse.addStudent(new Students(name, code));
                System.out.println("------------------------------------------------");

            }
        }

        // INTERSECTION LOGIC TO GET UNIQUE STUDENTS
        int totalUniqueStudents = teacher.totalUniqueStudents();
        System.out.println("Total unique students: " + totalUniqueStudents);
        sc.close();

    }
}
