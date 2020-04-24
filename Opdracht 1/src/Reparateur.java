import java.util.ArrayList;

public class Reparateur implements Medewerker{
    private String naam;
    private int aantalJaarInDienst;

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

    public int getAantalJaarInDienst() {
        return aantalJaarInDienst;
    }


    @Override
    public String naam() {
        return null;

    }
}