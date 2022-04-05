import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        ArrayList <Integer> liste = new ArrayList<Integer>(Arrays.asList(new Integer[] {5, 4, 7, 2, -7, 9, 3}));

        Sortierverfahren.bubbleSort(liste);
        System.out.println(liste);

    }
}

