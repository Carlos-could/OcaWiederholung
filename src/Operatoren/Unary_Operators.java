package Operatoren;

// Unäre Operatoren haben nur EINEN Operanden
// +, - als Vorzeichen, ++, -- und ! sind ünäre Operatoren

public class Unary_Operators {

    public static void main(String[] args) {

    int a = 5;
    // Jetzt aufgepasst:
    a = a++;
    // 1. für a 5 einsetzen;
    //2. a neu zuweisen aug 5 + 1
    //2. a neu zuweisen aug 5
        System.out.println(a); //5
    // Inkrementor und Dekrementor beinhalten immer eine Neuzuweisung
    // Also a++ wird zu a = a + 1
    // Ebenso wird ++a zu a = a + 1
        for (int i=0; i<10; i++){
            System.out.print(i);
        }
        System.out.println("");
        for (int i=0; i<10; ++i){
            System.out.print(i);
        }

    }
}
