import java.util.ArrayList;

public class Reis implements Comparable {

    private ArrayList<Node> stappen = new ArrayList<>();



    public ArrayList<Node> getStappen() {
        return stappen;
    }

    public void setStappen(ArrayList<Node> stappen) {
        this.stappen = stappen;
    }



    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
