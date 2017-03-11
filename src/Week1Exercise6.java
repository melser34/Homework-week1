import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */
//    3.6 Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

public class Week1Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some value");

        int value1;
        int value2;
        int sum;

        value1 = scanner.nextInt();
        value2 = scanner.nextInt();

        System.out.println("Value1 is " + value1);
        System.out.println("Value2 is " + value2);
        sum = value1 + value2;

      if (sum >= 11 && sum <= 19){

        System.out.println("Sum of value1 and value2 is in an amplitude from 11 to 19");
    }
else {
        System.out.println("Operation is invalid");

}
    }

}
