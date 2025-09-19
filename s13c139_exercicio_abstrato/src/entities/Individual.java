package entities;

public class Individual extends TaxPayer {
    private double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, double annuallncome, double healthExpenditures) {
        super(name, annuallncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnnuallncome() >= 20000.00) {
            return (getAnnuallncome() * 0.25) - (healthExpenditures * 0.5);
        } else {
            return (getAnnuallncome() * 0.15) - (healthExpenditures * 0.5);
        }
    }
}
