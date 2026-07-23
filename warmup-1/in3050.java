import java.util.*;

public class in3050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println(in(a,b));
        sc.close();
    }
    public static boolean in(int a, int b){
        boolean result = false;
        if (a >= 30 && a <= 40 && b>= 30 && b <= 40){
            result = true;
        }else if( a >= 40 && a<= 50 && b >= 40 && b <= 50){
            result = true;
        }

        return result;
    }
}
