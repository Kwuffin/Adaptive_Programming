public class AutoHuur {

    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {

    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
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

    public double totaalPrijs() {
        if(gehuurdeAuto == null || huurder == null){
            return 0;
        } else
            return aantalDagen * (gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKorting() / 100));
    }


    public String toString() {
        return (gehuurdeAuto == null ? "er is geen auto bekend\n" +
                (huurder == null ? String.format("er is geen huurder bekend\naantal dagen: %s en dat kost %s\n", aantalDagen, totaalPrijs())
                        : String.format("Op naam van: %s\n aantal dagen: %s en dat kost %s", huurder, aantalDagen, totaalPrijs()))
                : (gehuurdeAuto.toString() + "\n" +
                (huurder == null ? String.format("er is geen huurder bekend\naantal dagen: %s en dat kost %s", aantalDagen, totaalPrijs())
                        : String.format("Op naam van: %s\n aantal dagen: %s en dat kost %s", huurder, aantalDagen, totaalPrijs()))));
    }
}

