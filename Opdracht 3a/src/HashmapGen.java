import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class HashmapGen {

    public HashmapGen(){
    }

    public HashMap<String, String> hshmpGen(int lengte){

        ArrayList<String> sList1 = new ArrayList<String>();
        ArrayList<String> sList2 = new ArrayList<String>();
        HashMap<String, String> ssHashmap = new HashMap<String, String>();

        Random a = new Random();
        Random b = new Random();

        int counter = 0;

        for(int i = 0; i < lengte*2; i++){
            int r_int = a.nextInt(26);
            int r_int2 = b.nextInt(26);

            if(counter < lengte){
                if (r_int == 0) { sList1.add("a"); }
                else if(r_int == 1){ sList1.add("b"); }
                else if(r_int == 2){ sList1.add("c"); }
                else if(r_int == 3){ sList1.add("d"); }
                else if(r_int == 4){ sList1.add("e"); }
                else if(r_int == 5){ sList1.add("f"); }
                else if(r_int == 6){ sList1.add("g"); }
                else if(r_int == 7){ sList1.add("h"); }
                else if(r_int == 8){ sList1.add("i"); }
                else if(r_int == 9){ sList1.add("j"); }
                else if(r_int == 10){ sList1.add("k"); }
                else if(r_int == 11){ sList1.add("l"); }
                else if(r_int == 12){ sList1.add("m"); }
                else if(r_int == 13){ sList1.add("n"); }
                else if(r_int == 14){ sList1.add("o"); }
                else if(r_int == 15){ sList1.add("p"); }
                else if(r_int == 16){ sList1.add("q"); }
                else if(r_int == 17){ sList1.add("r"); }
                else if(r_int == 18){ sList1.add("s"); }
                else if(r_int == 19){ sList1.add("t"); }
                else if(r_int == 20){ sList1.add("u"); }
                else if(r_int == 21){ sList1.add("v"); }
                else if(r_int == 22){ sList1.add("w"); }
                else if(r_int == 23){ sList1.add("x"); }
                else if(r_int == 24){ sList1.add("y"); }
                else{ sList1.add("z"); }
                counter++;
            }
            else{
                if (r_int2 == 0) { sList1.add("a"); }
                else if(r_int2 == 1){ sList2.add("b"); }
                else if(r_int2 == 2){ sList2.add("c"); }
                else if(r_int2 == 3){ sList2.add("d"); }
                else if(r_int2 == 4){ sList2.add("e"); }
                else if(r_int2 == 5){ sList2.add("f"); }
                else if(r_int2 == 6){ sList2.add("g"); }
                else if(r_int2 == 7){ sList2.add("h"); }
                else if(r_int2 == 8){ sList2.add("i"); }
                else if(r_int2 == 9){ sList2.add("j"); }
                else if(r_int2 == 10){ sList2.add("k"); }
                else if(r_int2 == 11){ sList2.add("l"); }
                else if(r_int2 == 12){ sList2.add("m"); }
                else if(r_int2 == 13){ sList2.add("n"); }
                else if(r_int2 == 14){ sList2.add("o"); }
                else if(r_int2 == 15){ sList2.add("p"); }
                else if(r_int2 == 16){ sList2.add("q"); }
                else if(r_int2 == 17){ sList2.add("r"); }
                else if(r_int2 == 18){ sList2.add("s"); }
                else if(r_int2 == 19){ sList2.add("t"); }
                else if(r_int2 == 20){ sList2.add("u"); }
                else if(r_int2 == 21){ sList2.add("v"); }
                else if(r_int2 == 22){ sList2.add("w"); }
                else if(r_int2 == 23){ sList2.add("x"); }
                else if(r_int2 == 24){ sList2.add("y"); }
                else{ sList2.add("z"); }
                counter++;
            }
            }
        System.out.println(sList1 + "\n"+ sList2);
        for(int i = 0; i < lengte; i++){
            ssHashmap.put(sList1.get(i), sList2.get(i));
        }
        System.out.println("Generated Hashmap: " + ssHashmap);
        return ssHashmap;
        }
    }
