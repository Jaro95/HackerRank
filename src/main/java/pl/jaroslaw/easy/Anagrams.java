package pl.jaroslaw.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

/*
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings a and b consist of English alphabetic characters.
The comparison should NOT be case sensitive.
 */
public class Anagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    private static boolean isAnagram(String a, String b) {

        Map<Character, Integer> wordA = countCharInWord(a.toLowerCase());
        Map<Character, Integer> wordB = countCharInWord(b.toLowerCase());
        return wordA.equals(wordB);
        // More detailed explanation without using the equals method
//        if (wordA.size() == wordB.size()) {
//            AtomicBoolean check = new AtomicBoolean(true);
//            wordA.forEach((key,value) -> {
//                if(wordB.containsKey(key)) {
//                    if(!Objects.equals(value, wordB.get(key))) {
//                        check.set(false);
//                    }
//                } else {
//                    check.set(false);
//                }
//            });
//            return check.get();
//        } else {
//            return false;
//        }
    }

    private static Map<Character, Integer> countCharInWord(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            Character checkChar = word.charAt(i);
            if (map.containsKey(checkChar)) {
                Integer digit = map.get(checkChar);
                map.put(checkChar, ++digit);
            } else {
                map.put(checkChar, 1);
            }
        }
        return map;
    }

}
