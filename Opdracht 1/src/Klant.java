public class Klant {
    private String naam;

    public Klant(String nm){
        naam = nm;
    }

    public String toString(){
        return String.format("Deze klan heet %s", naam);
    }


}