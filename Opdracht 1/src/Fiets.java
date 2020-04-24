public class Fiets {
    private String merk;
    private int prijs;

    public Fiets(String mk, int p){
        merk = mk;
        prijs = p;
    }

    public void setModel(String mk) {
        this.merk = mk;
    }

    public String getModel() {
        return merk;
    }

    public void setPrijs(int p) {
        this.prijs = p;
    }

    public int getPrijs() {
        return prijs;
    }

    public String toString(){
        return String.format("Merk: %s\nPrijs: %s", getModel(), prijs);
    }
}