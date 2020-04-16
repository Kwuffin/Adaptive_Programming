import java.util.ArrayList;

public class Auto {

    private String type;
    private double prijsPerDag;
    private ArrayList<AutoHuur> gehuurdeAuto = new ArrayList<>();

    public Auto(String tp, double prDg){
        type = tp;
        prijsPerDag = prDg;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }


    public String toString(){
        return String.format("autotype: %s met prijs per dag: %s", type, prijsPerDag);
    }
}