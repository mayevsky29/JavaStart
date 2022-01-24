package modulOne;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Виберіть одиницю вимірювання");
        System.out.println("1. Перевести в метри в дюйми");
        System.out.println("2. Перевести в метри в милі");
        System.out.println("3. Перевести в метри в ярди");
        int num = in.nextInt();
        System.out.print("Введіть кількість метрів для перетворення: ");
        int metr = in.nextInt();

        double res = 0;

        switch (num) {
            case 1:
                double inches = (39.370078 * metr);
                res = inches;
                break;
            case 2:
                double miles =  (metr / 1609);
                res = miles;
                break;
            case 3:
                double yard =  (0.9144 * metr);
                res = yard;
                break;

            default:

        }
        System.out.print(res);
    }
}


