public class Verkoper implements Medewerker{
    private String naam;
    private int aantalJaarInDienst;

    public Verkoper(String nm, int dienst){
        naam = nm;
        aantalJaarInDienst = dienst;
    }

    @Override
    public String naam() {
        return null;
    }


}