package Work;

//Зробити реалізацію калькулятора з методами
//+
//-
//*
//:
//кв корінь
//
//піднесення до ступеня
//
//вікористовуючи інтерфейси
import java.util.Scanner;

public class Work6 {
    public interface operations{
        double plus(double a, double b);
        double minus(double a, double b);
        double multiply(double a, double b);
        double divide(double a, double b);
        double power(double a, double b);
        double sqrt(double a);
    }
    public static class ArithmeticOperations implements operations{
        @Override
        public double plus(double a, double b) {
            return a + b;
        }

        @Override
        public double minus(double a, double b){
            return a - b;
        }
        @Override
        public  double multiply(double a, double b){
            return a * b;
        }
        @Override
        public double divide(double a, double b){
            return a/b;
        }
        @Override
        public double power(double a, double b){
            return Math.pow(a, b);
        }
        @Override
        public double sqrt(double a){
            if (a >= 0) {
                return Math.sqrt(a);
            } else {
                throw new IllegalArgumentException("Square root of a negative number is undefined");
            }
        }
    }
    public static void main(String[] args){
        ArithmeticOperations operation = new ArithmeticOperations();
        Scanner scan = new Scanner(System.in);
        System.out.println("Write one of this symbols(+, -, *, /, ^, sqrt): " +
                "\nif u choose ^ formula is a^b" +
                "\nif u choose sqrt: sqrt.a");
        String type = scan.next();
        System.out.println("Write first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Write second number: ");
        double num2 = scan.nextDouble();

        double result;
        switch (type) {
            case "+":
                result = operation.plus(num1, num2);
                break;
            case "-":
                result = operation.minus(num1, num2);
                break;
            case "*":
                result = operation.multiply(num1, num2);
                break;
            case "/":
                result = operation.divide(num1, num2);
                break;
            case "^":
                result = operation.power(num1, num2);
                break;
            case "sqrt":
                result = operation.sqrt(num1);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("Result: " + result);
    }
}
