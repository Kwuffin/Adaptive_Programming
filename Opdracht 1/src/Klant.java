import java.util.ArrayList;

public class Klant {
    private String naam;
    private ArrayList<Fietsenwinkel> klanten = new ArrayList<>();

    public Klant(String nm){
        naam = nm;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString(){
        return String.format("%s", naam);
    }


}