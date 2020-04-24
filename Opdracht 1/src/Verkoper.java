import java.util.ArrayList;

public class Verkoper {
    private String naam;
    private int aantalJaarInDienst;
    private ArrayList<Fietsenwinkel> verkopers = new ArrayList<>();

    public Verkoper(String nm, int dienst){
        naam = nm;
        aantalJaarInDienst = dienst;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAantalJaarInDienst(int aJID) {
        this.aantalJaarInDienst = aJID;
    }
}