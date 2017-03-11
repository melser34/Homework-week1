import java.util.Scanner;

/**
 * Created by set on 11.03.2017.
 */
public class Week1Exercise8new {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some value");

        int value1;
        int value2;

        value1 = scanner.nextInt();
        value2 = scanner.nextInt();

        if(value1 % 10 == value2 % 10 && value1 % 100 == value2 % 100){

            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}


