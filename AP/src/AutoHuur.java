public class AutoHuur {

    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur(){

    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs(){
        return aantalDagen*(gehuurdeAuto.getPrijsPerDag()*(huurder.getKorting()/100));
    }

    public String toString(){
        String.format("aantal dagen: %s en dat kost %s", aantalDagen);
    }
}
