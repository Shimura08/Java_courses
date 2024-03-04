package Work;

public class Work2 {
    public static void main(String[] args){
        int a = 9;
        int b = 19;
        int result;

        result = sum(a, b);
        System.out.println(result);
    }

    static int sum(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += 1;
        }
        return sum;
    }
}
