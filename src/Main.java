import java.util.Scanner;

public class Main
{
    static int antalPersoner;
    public static final String GUL_TYK_TEKST = "\033[1;93m"; // gul tyk farve til tekst
    public static final String RED_TEKST = "\033[1;91m"; // rød tyk farve til tekst
    public static final String RESET = "\u001B[0m"; // resetter tekstens farve til default farve

    public static void main(String[] args)
    {
        Ingredienser sandKage = new Ingredienser();

        Scanner sc = new Scanner(System.in);
        System.out.print("Indtast hvor mange personer du skal bage kage til: ");
        antalPersoner = sc.nextInt();
        System.out.println("\nSandkage til " + antalPersoner + " person(er)"); // informere brugeren om kagen og pers.
        System.out.println("Opskrift:\n");

        System.out.printf(GUL_TYK_TEKST + "%-15s%-10s%-10s%-10s%-15s%-10s\n", "Ingrediens", "Mængde", "Enhed", "kJ", "Vægt i gram", "kcal" + RESET);
        System.out.println(sandKage.Find("Mel"));
        System.out.println(sandKage.Find("Sukker"));
        System.out.println(sandKage.Find("Smør"));
        System.out.println(sandKage.Find("Æg"));
        System.out.println(sandKage.Find("Bagepulver"));

        System.out.println(RED_TEKST + "----------------------------------------------------------------" + RESET);
        System.out.println("Totalvægt i gram: " + sandKage.weightAll(41.67) + " gram.");
        System.out.println("Total kalorieindhold i kilokalorier: " + Math.round(sandKage.energyAll(41.67) * 0.239) + " kcal");
        System.out.println("Total energi (i kJ): " + sandKage.energyAll(41.167) + " kJ\n");
        System.out.println("Gennemsnitlig vægt pr. ingrediens: " + sandKage.weightAll(41.67) / 5 + " gram");
        System.out.println("Gennemsnitlig kJ pr. ingrediens: " + sandKage.energyAll(41.67) / 5 + " kJ");
    }
}

