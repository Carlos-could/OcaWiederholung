import java.util.ArrayList;

public class Sortierverfahren {

    public static void bubbleSort(ArrayList<Integer> liste) {
        boolean b = true;
        while(b) {
            b = false;
            for ( int i=0; i < liste.size()-1; i++) {


                if (liste.get(i) > liste.get(i + 1)) {

                    int zahl = liste.get(i+1);
                    liste.set((i+1), liste.get(i));
                    liste.set(i, zahl);
                    b = true;
                }

            }

        }

    }


}
