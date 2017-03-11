import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */

// 3.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
// Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

public class Week1Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first;
        first = scanner.nextInt();
        System.out.println("first =" + first);
        if (first >= 0 && first <= 24) {
            if (first >= 9 && first <= 18) {
                System.out.println("I'm working, please call me later");
            } else {
                System.out.println("I'm at home");

            }

        } else {

            System.out.println("Error");


        }

    }

}



