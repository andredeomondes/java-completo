import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double formulaArea, pi, raio;
        pi = 3.14159;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();

        formulaArea = pi * raio * raio;

        System.out.printf("A = %.4f\n", formulaArea);


    }
}

/*
Faça um programa para ler o valor do raio de um círculo,
e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/