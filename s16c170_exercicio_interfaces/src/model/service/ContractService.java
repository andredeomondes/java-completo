package model.service;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months; //  CÁLCULO DE PARCELAS BASE

        for (int i = 1; i <= months ; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i); // PARCELA E JUROS
            double fee = onlinePaymentService.paymentFee(basicQuota + interest); // TAXA DE PAGAMENTO
            double quota = basicQuota + interest + fee; // Valor da Parcela c/ juros + Taxa de pagamento
            contract.getInstallments().add(new Installment(dueDate, quota));

        }
    }
}
