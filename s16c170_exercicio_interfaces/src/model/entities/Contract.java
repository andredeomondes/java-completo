package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private double Number;
    private LocalDate date;
    private double totalValue;

    private final List<Installment> installments = new ArrayList<>();

    public Contract() {
    }

    public Contract(double number, LocalDate date, double totalValue) {
        Number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public double getNumber() {
        return Number;
    }

    public void setNumber(double number) {
        Number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }


    public List<Installment> getInstallments() {
        return installments;
    }
}
