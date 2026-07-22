import java.util.*;

public class close10 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(close(a, b));
        sc.close();

    }

    public static int close(int a, int b){
        int result = 0;
        if(Math.abs(10- a) > Math.abs(10 - b)){
            result = b;
        }else if (Math.abs(10- b) >Math.abs(10 - a)){
            result = a;
        }else if (Math.abs(10 - a) == Math.abs(10 - b)){
            result = 0;
        }

        return result;
    }
}
