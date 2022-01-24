package modulOne;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ВВедіть номер місяця:");
        int month = in.nextInt();
        String res;
        switch (month) {
            case 1:
            case 2:
            case 12:
                res = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                res = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                res = "Літо";
                break;
            case 9:
            case 10:
            case 11:
                res = "Осінь";
                break;
            default:
                res = "Не існує такого місяця!";
        }
        System.out.println(res);
    }
}
