package product;

public class Notas {
    public String name;
    public double av1;
    public double av2;
    public double av3;
    public double finalGrade;

    public double finalGrade() {
        return finalGrade = av1 + av2 + av3;


    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade;

        } else {
            return 0.0;
        }
    }

    public String isPassed() {
        if (missingPoints() == 0) {
            return "PASS";
        } else {
            return "FAILED"
                    + "\n" + "MISSING "
                    + String.format("% .2f", missingPoints())
                    + " POINTS";
        }

    }
}