package pl.jaroslaw.easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a string, s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
 Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, s .

Constraints

s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_),
  apostrophes ('), and at symbols (@).
Output Format

On the first line, print an integer,n , denoting the number of tokens in string s (they do not need to be unique). Next, print each of the n tokens on a new line in the
same order as they appear in input string s.
 */
public class StringTokens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().trim();
        if(word.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arrayWord = splitWord(word);
            System.out.println(arrayWord.length);
            for (String part : arrayWord) {
                System.out.println(part);
            }
        }
    }

    public static String[] splitWord(String word) {
       return word.split("[ !,?._'@]+");
    }
}
