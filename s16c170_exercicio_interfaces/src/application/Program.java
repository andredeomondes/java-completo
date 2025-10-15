package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import static model.entities.Installment.fmt;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Secção de criação do objeto CONTRATO -------------------------------
        System.out.println("Entre os dados do contrato: ");

        System.out.print("Número: ");
        double number = sc.nextInt();


        System.out.print("Data (dd/MM/yyyy): " );
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        // Secção de criação do objeto PARCELAS -------------------------------

        System.out.print("Entre com o número de parcelas: ");
        int qteInstallmments = sc.nextInt();

        System.out.println("Parcelas: ");
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, qteInstallmments);

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
            
        }

        sc.close();

    }
}
