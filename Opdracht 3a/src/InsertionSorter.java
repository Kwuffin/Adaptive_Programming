import java.util.ArrayList;

public class InsertionSorter {



    public InsertionSorter(){
    }

    public ArrayList<String> insertionSorter(ArrayList<String> iList){

        for(int i = 1; i < iList.size(); i++){
            int j = i - 1;

            while (j >= 0 && iList.get(j).compareToIgnoreCase(iList.get(i)) > 0) {
                iList.set(j + 1, iList.get(j));
                j = j - 1;
            }

        }
        return iList;
    }
}
