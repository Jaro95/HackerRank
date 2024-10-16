package pl.jaroslaw.easy;

import java.util.Scanner;

/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise, it will print "Wrong answer".

n can range between -100 to 100 inclusive.

Sample Input 0

100
Sample Output 0

Good job
 */
public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (-100 <= number && number <= 100) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
