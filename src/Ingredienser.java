import java.util.Objects;

public class Ingredienser
{
    private Values[] ing = new Values[5];

    public Ingredienser()
    {
        ing[0] = new Values("Mel", 41.67, "gram", 304.5, 41.67, 9.96);
        ing[1] = new Values("Sukker", 41.67, "gram", 425, 41.67, 9.96);
        ing[2] = new Values("Smør", 41.67, "gram", 374.46, 41.67, 9.96);
        ing[3] = new Values("Æg", 0.67, "stk.", 120.25, 40.2, 9.6);
        ing[4] = new Values("Bagepulver", 0.33, "tsk.", 0.7755, 1.65, 0.395);
    }

    public Values Find(String type){
        for (Values ingrediens : ing){
            if (Objects.equals(ingrediens.getType(), type)){
                return ingrediens;
            }
        }
        return null;
    }

    public double weightAll(double totalWeight)
    {
        for (Values weightPerUnit : ing){
            totalWeight += weightPerUnit.getWeightPerUnit() * Main.antalPersoner;
        }
        return Math.round(totalWeight);
    }

    public double energyAll(double totalEnergi){
        for (Values energi : ing){
            totalEnergi += energi.getEnergi() * Main.antalPersoner;
        }
        return Math.round(totalEnergi);
    }
}
