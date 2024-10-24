package pl.jaroslaw.easy.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Porównywarki służą do porównywania dwóch obiektów. W tym wyzwaniu utworzysz porównywarkę i użyjesz jej do sortowania tablicy.

Klasa Player jest dostępna dla Ciebie w edytorze. Mapola: aSznurek iliczba całkowita.

Biorąc pod uwagę tablicę Obiekty gracza , napisz komparator, który sortuje je według malejącego wyniku; jeślilub więcej graczy ma taki sam wynik,
posortuj tych graczy alfabetycznie według nazwy. Aby to zrobić, musisz utworzyć klasę Checker , która implementuje interfejs Comparator ,
 a następnie napisać metodę int compare(Player a, Player b) implementującą metodę Comparator.compare(T o1, T o2) .

Format wejściowy

Dane wejściowe ze standardowego wejścia są obsługiwane przez zablokowany kod zastępczy w klasie Solution .

Pierwszy wiersz zawiera liczbę całkowitą,, oznaczający liczbę graczy.
Każdy zkolejne linie zawierają dane graczaI, odpowiednio.

Ograniczenia

gracze mogą mieć takie samo imię.
Nazwy graczy składają się z małych liter alfabetu angielskiego.
Format wyjściowy

Nie jesteś odpowiedzialny za drukowanie jakichkolwiek danych wyjściowych do stdout. Zablokowany kod stub w Solution utworzy obiekt Checker ,
 użyje go do sortowania tablicy Player i wydrukuje każdy posortowany element.

Przykładowe dane wejściowe

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Przykładowe wyjście

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
 */
class Checker implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
        if(o1.score < o2.score) {
            return 1;
        } else if (o1.score > o2.score) {
            return -1;
        } else {
         return o1.name.compareTo(o2.name);
        }
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}
