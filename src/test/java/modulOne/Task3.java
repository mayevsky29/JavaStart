package modulOne;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть значення 1: ");
        int num1 = in.nextInt();
        System.out.print("Введіть значення 2: ");
        int num2 = in.nextInt();
        System.out.print("Введіть значення 3: ");
        int num3 = in.nextInt();


        System.out.println(num1 +""+num2+""+num3);
        in.close();
    }
}
