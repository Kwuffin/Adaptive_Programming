import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner sc_aa = new Scanner(System.in);
        System.out.println("Hoeveel Strings wil je in je lijst?");
        int aantal = sc_aa.nextInt();

        StringGen sg1 = new StringGen();
        Sorter bubble = new Sorter();

        System.out.println(bubble.bubblesorter(sg1.strGen(aantal))); // Maak een lijst en voer een bubble sort uit.
    }
}
