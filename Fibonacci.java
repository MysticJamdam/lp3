import java.util.Scanner;
public class Fibonacci{
    private static int recursiveFib(int n){
        if(n <= 1){
            return n;
        }
        return recursiveFib(n-1) + recursiveFib(n-2); 
    }
    private static int iterativeFib(int n){
        int a = 0;
        int b = 1;
        for(int i = 0; i <= n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res1 = recursiveFib(n);
        int res2 = iterativeFib(n);
        System.out.println(res1);
        System.out.println(res1);


    }
}