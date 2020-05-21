import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc_aa = new Scanner(System.in);
        System.out.println("Hoeveel Strings wil je in je lijst?");
        int aantal = sc_aa.nextInt();

        // Als je meerdere verschillende "Generated lists" wilt, maak meer StringGen objecten aan.
        // Geef elk StringGen object door aan elk verschillend sorteer-algoritme.
        ArrayGen sg1 = new ArrayGen();
        HashmapGen hg1 = new HashmapGen();


        // Bubble sort op ArrayList:
        BubbleSorter bubble = new BubbleSorter();
        System.out.println("Bubble sort op ArrayList:");
        System.out.println("Sorted ArrayList:    " + bubble.bubbleSorterArray(sg1.strGen(aantal)) + "\n"); // Maak een lijst en voer een bubble sort uit.


        // Insertion sort op ArrayList:
        InsertionSorter insertion = new InsertionSorter();
        System.out.println("Insertion sort op ArrayList:");
        System.out.println("Sorted ArrayList:    " + insertion.insertionSorterArray(sg1.strGen(aantal)));


        // Hashmap sort WIP:

        System.out.println(hg1.hshmpGen(aantal));
    }
}
