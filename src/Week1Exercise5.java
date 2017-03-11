import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */
//  3.5 Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
//        Если второе больше, то выводим сумму.
public class Week1Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some value");

        int value1;
        int value2;
        value1 = scanner.nextInt();
        value2 = scanner.nextInt();
        System.out.println("Value1 is " + value1);
        System.out.println("Value2 is " + value2);
        if (value1 > value2) {
            System.out.println(value1 - value2);
        }

else {
            System.out.println(value1 + value2);

        }

    }
}
