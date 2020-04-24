import java.util.ArrayList;

public class Reparateur {
    private String naam;
    private int aantalJaarInDienst;
    private ArrayList<Fietsenwinkel> reparateurs = new ArrayList<>();

    public Reparateur(String nm, int dienst){
        naam = nm;
        aantalJaarInDienst = dienst;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAantalJaarInDienst(int aantalJaarInDienst) {
        this.aantalJaarInDienst = aantalJaarInDienst;
    }
}