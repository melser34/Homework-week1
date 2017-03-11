import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */
//    3.7 Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
public class WeekExercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some value");

        int value1;
        int value2;

        value1 = scanner.nextInt();
        value2 = scanner.nextInt();

        System.out.println("Value1 is " + value1);
        System.out.println("Value2 is " + value2);

        if (value1 % value2 == 0) {
            System.out.println("That's true");
        } else {
            System.out.println("Operation is invalid");
        }
    }
}
