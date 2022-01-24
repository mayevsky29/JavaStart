package modulOne;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        int num = 123456;
        reverseMethod(num);
    }

    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseMethod(number / 10);
        }
    }
}

