public class AutoHuur {

    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Auto huurder;

    public AutoHuur(){

    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA){
        this.gehuurdeAuto = gA;
    }

    public void setHuurder(Auto huurder) {
        this.huurder = huurder;
    }
}
