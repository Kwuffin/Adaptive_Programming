import java.util.ArrayList;

public class Fiets {
    private String merk;
    private int prijs;
    private ArrayList<Fietsenwinkel> fiets = new ArrayList<>();

    public Fiets(String mk, int p){
        merk = mk;
        prijs = p;
    }


    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String toString(){
        return String.format("Merk: %s\nPrijs: %s", merk, getPrijs());
    }
}