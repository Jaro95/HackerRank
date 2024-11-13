package pl.jaroslaw.easy;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
 */
public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int digitCheck = word.length() / 2;
        System.out.println(checkWord(word, digitCheck) ? "Yes" : "No");
    }

    public static boolean checkWord(String word, int digitCheck) {
        for (int i = 0; i < digitCheck; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
