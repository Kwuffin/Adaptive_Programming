import java.util.ArrayList;

public class Sorter {

    public Sorter(){
    }

    public ArrayList<String> bubblesorter(ArrayList<String> aList){

        for(int i = 0; i < aList.size(); i++){
            for(int j = i + 1; j < aList.size(); j++){
                if(aList.get(j).compareToIgnoreCase(aList.get(i)) < 0){
                    String temp = aList.get(i);
                    aList.set(i, aList.get(j));
                    aList.set(j, temp);
                }
            }
        }
        return aList;
    }
}
