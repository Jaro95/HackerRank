package pl.jaroslaw.easy;

import java.util.Scanner;

/*
„Tradycyjnie ciąg znaków to sekwencja znaków, albo jako stała dosłowna, albo jako pewien rodzaj zmiennej.” — Wikipedia: String (informatyka)

To ćwiczenie ma na celu sprawdzenie twojego zrozumienia Java Strings. Przykładowa deklaracja String :

String myString = "Hello World!"
Elementy String nazywane są znakami . Liczba znaków w String nazywana jest długością i można ją pobrać za pomocą metody String.length() .

Biorąc pod uwagę dwa ciągi małych liter języka angielskiego,I, wykonaj następujące operacje:

Zsumuj długościI.
Określ, czyjest leksykograficznie większy niż(tj. czyprzyjść wcześniejw słowniku?).
Zacznij pisać wielką literąIi wydrukuj je w jednym wierszu, rozdzielone spacją.
Format wejściowy

Pierwszy wiersz zawiera ciąg znaków.Drugi wiersz zawiera inny ciąg znakówCiągi znaków składają się wyłącznie z małych liter alfabetu angielskiego.

Format wyjściowy

Wyjście składa się z trzech wierszy:
W pierwszym wierszu zsumuj długościI.
W drugim wierszu napisz Yesjeślijest leksykograficznie większy niżw przeciwnym razie wydrukuj Nozamiast tego.
W trzecim wierszu napisz wielką literę na początku obuIi wydrukuj je w jednym wierszu, rozdzielone spacją.

Przykładowe dane wejściowe 0

Cześć
Java
Przykładowy wynik 0

9
Nie,
cześć Jawo
Wyjaśnienie 0

Smyczkowyto jest "cześć" ijest "java".

ma długość​, Ima długość​; suma ich długości wynosi.
Posortowane alfabetycznie/leksykograficznie „hello” poprzedza „java”; dlategonie jest większe niżi odpowiedź brzmi No.

Kiedy piszesz wielką literę na początku obu wyrazówIa następnie wydrukuj je rozdzielone spacją, otrzymasz „Hello Java”.
 */
public class StringsIntroduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        System.out.println(first.length() + second.length());
        System.out.println(first.compareTo(second) < 1 ? "No" : "Yes");
        System.out.println(first.substring(0,1).toUpperCase() + first.substring(1) +
                " " + second.substring(0,1).toUpperCase() + second.substring(1));
    }
}
