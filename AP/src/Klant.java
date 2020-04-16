public class Klant {

    private String naam;
    private double kortingsPercentage;

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
