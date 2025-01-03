import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        double pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a * c)/2;
        System.out.printf("TRIANGULO: %.3f\n", triangulo);

        circulo = pi * c * c;
        System.out.printf("CIRCULO: %.3f\n", circulo);

        trapezio = (a + b) * c / 2;
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);

        quadrado = b * b;
        System.out.printf("QUADRADO: %.3f\n", quadrado);

        retangulo = a * b;
        System.out.printf("RETANGULO: %.3f\n", retangulo);

    }
}

