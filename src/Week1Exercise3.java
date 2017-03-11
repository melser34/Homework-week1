import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */

//     3.3 Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

public class Week1Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        value = scanner.nextInt();
        if (value % 7 == 0) {

            System.out.println(value * 2);
        }
            else {
                System.out.println("Operation doesn't work");
            }
        }
    }

