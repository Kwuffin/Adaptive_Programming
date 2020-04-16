import java.util.ArrayList;

public class Klant {

    private String naam;
    private double kortingsPercentage;
    private ArrayList<AutoHuur> huurder = new ArrayList<>();


    public Klant(String nm, double korting){
        naam = nm;
        kortingsPercentage = korting;

    }

    public String getNaam() {
        return naam;
    }

    public double getKortingsPercentage() {
        return kortingsPercentage;
    }


    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKortingsPercentage(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

}
