import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */

//  3.4 Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

public class Week1Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value;
        value = scanner.nextFloat();
        System.out.println("value = " + value);
        if (value > 0 && value < 1){

            System.out.println("Value is in an amplitude from 0 to 1");
        }

        else{
            System.out.println("Operation error");
        }

    }
}

