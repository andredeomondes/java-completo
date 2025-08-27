package application;

import model.entities.Client;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;
import model.entities.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Client Data
        System.out.println("\nEnter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();

        Client client = new Client(name, email, birthDate);


        // Order data
        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.print("How many items to this order? ");
        int qtyItems = sc.nextInt();
        sc.nextLine();

        Order order = new Order(new Date(), status, client);


        for (int i = 0; i < qtyItems; i++) {
            System.out.println("\nEnter #" + (i + 1) + " item data");

            // Product
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            Product product = new Product(productName, productPrice);

            // OrderItem
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(qty, productPrice, product);
            order.addItem(orderItem);

        }

        System.out.println("\n ------------------- ORDER SUMMARY ---------------------- ");
        System.out.println(order);


    }
}
