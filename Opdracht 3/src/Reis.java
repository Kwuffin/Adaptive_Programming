import java.util.ArrayList;

public class Reis implements Comparable {

    private ArrayList<Stap> stappen = new ArrayList<>();
    private int afstand;



    public int getAfstand() { return afstand; }

    public void setAfstand(int afstand) { this.afstand = afstand; }

    public ArrayList<Stap> getStappen() {
        return stappen;
    }

    public void setStappen(ArrayList<Stap> stappen) {
        this.stappen = stappen;
    }



    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
