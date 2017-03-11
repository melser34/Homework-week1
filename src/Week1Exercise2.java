import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */

//3.2 Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
//      Math.max(a, b) -> возвращает максимальное из двух чисел
//    Math.min(a, b) -> аналог
public class Week1Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1;
        int x2;
        int x3;
        int max;
        int min;

        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        x3 = scanner.nextInt();

        max = Math.max(x1, x2);
        min = Math.min(x1, x2);
        max = Math.max(x3, max);
        min = Math.min(x3, min);

        System.out.println("x1 is " + x1);
        System.out.println("x2 is " + x2);
        System.out.println("x3 is " + x3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
