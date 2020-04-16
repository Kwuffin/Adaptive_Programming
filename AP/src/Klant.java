import java.util.ArrayList;

public class Klant {

    private String naam;
    private double kortingsPercentage;
    private ArrayList<AutoHuur> huurder = new ArrayList<>();


    public Klant(String nm, double korting) {
        naam = nm;
        kortingsPercentage = korting;

    }

    public void setKorting(double kP){
        this.kortingsPercentage = kP;
    }

    public double getKorting(){
        return kortingsPercentage;
    }

    public String toString(){
        return String.format("op naam van: %s (korting: %s)", naam, kortingsPercentage);
    }

}
