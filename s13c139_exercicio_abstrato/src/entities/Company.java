package entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, double annuallncome, int numberOfEmployees) {
        super(name, annuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return getAnnuallncome() * 0.14;
        } else {
            return getAnnuallncome() * 0.16;
        }
    }
}
