package Operatoren;

public class Arithmetic_Operators {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 5;

        //byte c = a+b; // kompiliert nicht , weil Ergebnis von Typ int ist
        byte c = 5+5;

        //byte d = 100 + 100; // kompiliert nicht, weil Ergebnis von Typ int ist

        byte d = (byte)(100+100); //-129 + 73 ) -53 (byte overflow)
        //      System.out.println((byte)(100+100));

        long e = 100;
        int f = 100;
        //    int g = e + g;
//      int h = 100l + 100l;    // la variable es de tipo int

        //        Der Schwierige Kandidat unter den Datentypen ist der Float
//      float i = 8.5;      // falta la f
        float i = 8.5f;
        float j = 8;

        long k = Long.MAX_VALUE;
        System.out.println(k);      // Zahl mit 64 bit..
        float l = k;
        System.out.println(l);      // Zahl mit 32 bit

    /*Merke
    Upcasting - Typenumwandlung von einem niedrigeren auf einen höheren Typ
    Downcasting - Typenumwandlung von einem höheren auf einen niedrigeren Typ
    implizit - Der kompiler fügt den Cast automatisch ein
    explizit - Der Programmierer gibt den Cast an
    Upcasting funktioniert grundsätzlich immer implizit (automatisch)
    Downcasting funktioniert grundsätzlich nur explizit, aber in bestimmten Fällen implizit:
    Bei Zuweisungen(asignacion von Literalen Ganzzahlen
    Bei zusammengesetzten Zuweisungsoperatoren
     */
    }


}
