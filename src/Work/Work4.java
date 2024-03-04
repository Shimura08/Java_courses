package Work;
//Даны три числа. Найти наименьшее из них.
import java.util.Scanner;

public class Work4 {
    public static double minNum(double a, double b, double c){
        if( a <= b && a <= c){
            return a;
        }
        else if( b <= a && b <= c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextInt();

        double result = minNum(number1, number2, number3);

        System.out.println("Minimum number: " + result);
    }
}
