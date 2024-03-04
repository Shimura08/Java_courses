package Work;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Work1 {
    public static void main(String[] args){
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Inout an integer number, n:");
            try{
                n = scanner.nextInt();
            } catch (InputMismatchException ex){
                scanner.next();
            }
        }while(checkingInputConditions(n));
        int[] array = new int[n];
        int j = 0;
        System.out.print("Initial sequence : ");
        for( int i = 0; i <= n; i++){
            if((i > 0) && (i % 2 != 0)){
                array[j] = i;
                j++;
            }
            System.out.print(i);

        }
        System.out.println("\nRequest array: ");
        showArray(array);
    }

    private static void showArray(int[] array) {
        for(int elem : array){
            System.out.print(elem + "");
        }
    }

    private static boolean checkingInputConditions(int n){
        if (n<=0){
            System.out.println("Input must be >0 and integer. Try again");
            return true;
        }
        return false;
    }
}
