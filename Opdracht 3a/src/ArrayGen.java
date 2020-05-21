import java.util.ArrayList;
import java.util.Random;

public class ArrayGen {

    public ArrayGen() {
    }

    public ArrayList<String> strGen(int lengte) {

        ArrayList<String> sList = new ArrayList<>(lengte);

        Random a = new Random();

        for (int i = 0; i < lengte; i++) {
            int r_int = a.nextInt(26);

            if (r_int == 0) { sList.add("a"); }
            else if(r_int == 1){ sList.add("b"); }
            else if(r_int == 2){ sList.add("c"); }
            else if(r_int == 3){ sList.add("d"); }
            else if(r_int == 4){ sList.add("e"); }
            else if(r_int == 5){ sList.add("f"); }
            else if(r_int == 6){ sList.add("g"); }
            else if(r_int == 7){ sList.add("h"); }
            else if(r_int == 8){ sList.add("i"); }
            else if(r_int == 9){ sList.add("j"); }
            else if(r_int == 10){ sList.add("k"); }
            else if(r_int == 11){ sList.add("l"); }
            else if(r_int == 12){ sList.add("m"); }
            else if(r_int == 13){ sList.add("n"); }
            else if(r_int == 14){ sList.add("o"); }
            else if(r_int == 15){ sList.add("p"); }
            else if(r_int == 16){ sList.add("q"); }
            else if(r_int == 17){ sList.add("r"); }
            else if(r_int == 18){ sList.add("s"); }
            else if(r_int == 19){ sList.add("t"); }
            else if(r_int == 20){ sList.add("u"); }
            else if(r_int == 21){ sList.add("v"); }
            else if(r_int == 22){ sList.add("w"); }
            else if(r_int == 23){ sList.add("x"); }
            else if(r_int == 24){ sList.add("y"); }
            else{ sList.add("z"); }
        }
        System.out.println("Generated ArrayList: "+ sList);
        return sList;
    }
}
