public class Fietsenwinkel {
    private int aantalMedewerkers;
    private Klant klanten;
    private Fiets fietsen;

    public Fietsenwinkel(){
    }

    public Fiets getFiets() {
        return fietsen;
    }

    public int getAantalMedewerkers() {
        return aantalMedewerkers;
    }

    public Klant getKlanten() {
        return klanten;
    }

    public Fiets getFietsen(){
        return fietsen;
    }

    public String toString(){
        return (fietsen == null ? "Er zijn geen fietsen beschikbaar" : "ja");
    }

}