package entities;

public abstract class TaxPayer {
    private String name;
    private double annuallncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, double annuallncome) {
        this.name = name;
        this.annuallncome = annuallncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnuallncome() {
        return annuallncome;
    }

    public void setAnnuallncome(double annuallncome) {
        this.annuallncome = annuallncome;
    }

    public abstract double tax();

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", getName(), tax());
    }
}

