package model.service;

public class PaypalService implements OnlinePaymentService {
    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public double paymentFee(double amount) {
        // TAXA DE PAGAMENTO: [ PARCELA COM JUROS ] * [ TAXA DE PAGAMENTO ]
        return amount * FEE_PERCENTAGE;
    }

    public double interest(double amount, int months) {
        // JUROS DA PARCELA:  [ PARCELA BRUTA ] * [ JUROS ] * [ NÚMERO DA PARCELA ]
        return amount * MONTHLY_INTEREST * months;


    }
}
