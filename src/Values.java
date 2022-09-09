import java.text.DecimalFormat;

public class Values
{
    // Attributter
    private String type; // type kan være smør, sukker, æg osv.
    private double amount; // amount er mængden af ingrediensen
    private String unit; // unit er måleenheden, som mængden bliver målt i
    private double energi; // energi er mængden af kilojoule
    private double weightPerUnit; // weightPerUnit er vægten af hver ingrediens omregnet til gram.
    private double kcal;
    private static final DecimalFormat df = new DecimalFormat("0.00"); // decimalformat klasse til at udskrive 2 decimaler

    public Values(String type, double amount, String unit, double energi, double weightPerUnit, double kcal)
    {
        // Konstruktør
        this.type = type;
        this.amount = amount;
        this.unit = unit;
        this.energi = energi;
        this.weightPerUnit = weightPerUnit;
        this.kcal = kcal;
    }


    // get metoder
    public String getType(){
        return type;
    }

    public double getAmount(){
        return amount;
    }

    public String getUnit(){
        return unit;
    }

    public double getEnergi(){
        return energi;
    }

    public double getWeightPerUnit(){
        return weightPerUnit;
    }
    public double getKcal(){
        return kcal;
    }

    @Override
    public String toString() {
        return
                String.format("%-15s%-10s%-10s%-10s%-15s%-10s", type, df.format(amount * Main.antalPersoner),
                        unit, df.format(energi * Main.antalPersoner),
                        df.format(weightPerUnit * Main.antalPersoner),
                        df.format(kcal * Main.antalPersoner));
    }
}
