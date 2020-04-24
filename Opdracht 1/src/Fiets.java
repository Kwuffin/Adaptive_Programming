import java.util.ArrayList;

public class Fiets {
    private String merk;
    private int prijs;
    private ArrayList<Fietsenwinkel> fietsen = new ArrayList<>();

    public Fiets(String mk, int p){
        merk = mk;
        prijs = p;
    }


    public void setPrijs(int p) {
        this.prijs = p;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setMerk(String mk) {
        this.merk = mk;
    }

    public String toString(){
        return String.format("Merk: %s\nPrijs: %s", merk, getPrijs());
    }
}