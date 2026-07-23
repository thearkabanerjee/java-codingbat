import java.util.*;

public class lastdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(ladi(a, b));
        sc.close();
    }

    public static boolean ladi(int a, int b){
        if (a % 10 == b % 10){
            return true;
        }else{
            return false;
        }
    }
}
