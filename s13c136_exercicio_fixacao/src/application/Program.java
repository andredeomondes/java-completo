package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");

            System.out.print(" > Common, used or imported (c/u/i)? ");
            char typeProduct = sc.nextLine().toLowerCase().charAt(0);

            System.out.print(" > Name: ");
            String name = sc.nextLine();

            System.out.print(" > Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            if (typeProduct == 'i') {
                System.out.print(" > Customs fee: ");
                double customsFee = sc.nextDouble();
                sc.nextLine();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (typeProduct == 'u') {
                System.out.print(" > Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, date));

            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
        sc.close();
    }
}
