import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BubbleSorter {

    public BubbleSorter(){
    }

    public ArrayList<String> bubbleSorterArray(ArrayList<String> aList){

        // Bubble sort algorithm:
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



    public TreeMap<String, String> bubbleSorterHashmapKey(HashMap<String, String> hMap) {
        TreeMap<String, String> sortedTmap = new TreeMap<>();

        sortedTmap.putAll(hMap);

        return sortedTmap;

//        I tried to sort a HashMap, but then found out you can't sort HashMaps, the following code shows what I tried to do:
//        ArrayList<String> keyList = new ArrayList<>();
//        ArrayList<String> valueList = new ArrayList<>();
//
//        for(String key : hMap.keySet()){
//            keyList.add(key);
//            valueList.add(hMap.get(key));
//        }
//
//        // Bubble sort algorithm:
//        for(int i = 0; i < keyList.size(); i++){
//            for(int j = i + 1; j < keyList.size(); j++){
//
//                if(keyList.get(j).compareToIgnoreCase(keyList.get(i)) < 0){
//                    String temp = keyList.get(i);
//                    keyList.set(i, keyList.get(j));
//                    keyList.set(j, temp);
//                    String temp2 = valueList.get(i);
//                    valueList.set(i, valueList.get(j));
//                    valueList.set(j, temp2);
//                }
//            }
//        }
//
//
//        for(int i = 0; i < keyList.size(); i++){
//            sortedHmap.put(keyList.get(i), valueList.get(i));
//        }


//        for(int i = 0; i < hMap.size(); i++){
//            for(int j = i + 1; j < hMap.size(); j++){
//
//                if(hMap.get(keyList.get(j)).compareToIgnoreCase(hMap.get(keyList.get(i))) < 0){
//                    String temp = hMap.get(keyList.get(i));
//                    sortedHmap.put(keyList.get(j), valueList.get(j));
//                }
//            }
//        }
    }
}
