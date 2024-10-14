package pl.jaroslaw.easy;

import java.util.Scanner;

/*
Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100
cpp            065
python         050
================================
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
 */
public class JavaOutputFormatting {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();
        System.out.println("================================");
        System.out.println(formatWord(first));
        System.out.println(formatWord(second));
        System.out.println(formatWord(third));
        System.out.println("================================");
    }

    public static String formatWord(String word) {
        String[] formattedWord = word.split(" ");
        String first = formattedWord[0];
        String second = formattedWord[1];
        int maxLength = 15;
        formattedWord[0] = first + (" ".repeat(maxLength - first.length()));
        second = second.length() == 2 ? "0" + second : second;
        formattedWord[1] = second.length() == 1 ? "00" + second : second;
        return formattedWord[0] + formattedWord[1];
    }
}
