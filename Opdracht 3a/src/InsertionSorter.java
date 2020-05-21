import java.util.ArrayList;

public class InsertionSorter {


    public InsertionSorter() {
    }

    public ArrayList<String> insertionSorter(ArrayList<String> iList) {

        for (int i = 1; i < iList.size(); i++) { //
            String current = iList.get(i); // i is een iterator voor de lijst iList.
            int j = i - 1; // We willen i vergelijken met de vorige String, dus index i-1, oftewel j.

            // While j is groter dan 0 (om IndexErrors te voorkomen)
            // && compareToIgnoreCase is groter of gelijk aan 1, betekent dat j groter is dan i.
            while ((j >= 0) && ((iList.get(j).compareToIgnoreCase(current)) >= 1)) { //CompareTo method gevonden dankzij het internet.
                iList.set(j + 1, iList.get(j));
                j--;
            }
            iList.set(j + 1, current);
        }
        return iList;
    }
}
