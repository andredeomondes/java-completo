import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int numeroFuncionario, horasTrabalhadas;
        double salarioPorHora, salarioTotal;

        System.out.print("Digite o numero do funcionário: ");
        numeroFuncionario = sc.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor do salário por hora: ");
        salarioPorHora = sc.nextDouble();

        salarioTotal = horasTrabalhadas * salarioPorHora;

        System.out.println("NUMBER: " + numeroFuncionario);
        System.out.printf("SALARY: U$ %.2f\n", salarioTotal);


    }
}