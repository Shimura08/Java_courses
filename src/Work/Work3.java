package Work;

import java.util.Scanner;

public class Work3 {
    //Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
    //1.4, . . . , 2 кг конфет.
    public static void main(String[] args){
        double price;
        double[] arr = new double[4];

    }
    private static double[] price(double price){
        double[] list = new double[4];
        int j = 0;
            for(double i = 1.2; i < 2; i += 0.2){
                list[j] = price * i;
                j++;
            }
        return list;
    }
}
