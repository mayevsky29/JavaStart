package modulOne;



import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть значення 1: ");
        int num1 = in.nextInt();
        System.out.print("Введіть значення 2: ");
        int num2 = in.nextInt();
        int result = num1 / num2;

        System.out.println("Результат:" +result);
        in.close();
    }
}
