import java.util.ArrayList;
import java.util.HashMap;

public class BubbleSorter {

    public BubbleSorter(){
    }

    public ArrayList<String> bubbleSorterArray(ArrayList<String> aList){

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



    public HashMap<String, String> bubbleSorterHashmapKey(HashMap<String, String> hMap){
        HashMap<String, String> sortedHmap = new HashMap<>();
        ArrayList<String> keyList = new ArrayList<>();
        ArrayList<String> valueList = new ArrayList<>();

        for(String key : hMap.keySet()){
            keyList.add(key);
            valueList.add(hMap.get(key));
        }

        for(int i = 0; i < hMap.size(); i++){
            for(int j = i + 1; j < hMap.size(); j++){

                if(hMap.get(keyList.get(j)).compareToIgnoreCase(hMap.get(keyList.get(i))) < 0){
                    String temp = hMap.get(keyList.get(i));
                    sortedHmap.put(keyList.get(j), valueList.get(j));
                }
            }
        }
        return sortedHmap;
    }
}
