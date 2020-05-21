import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc_aa = new Scanner(System.in);
        System.out.println("Hoeveel Strings wil je in je lijst?");
        int aantal = sc_aa.nextInt();

        StringGen sg1 = new StringGen();


        // Bubble sort op ArrayList:
        BubbleSorter bubble = new BubbleSorter();
        System.out.println("Bubble sort:\nSorted list:    " + bubble.bubblesorter(sg1.strGen(aantal)) + "\n"); // Maak een lijst en voer een bubble sort uit.


        // Insertion sort op ArrayList:
        InsertionSorter insertion = new InsertionSorter();
        System.out.println("Insertion sort:\nSorted list2:   " + insertion.insertionSorter(sg1.strGen(aantal)));
    }
}
