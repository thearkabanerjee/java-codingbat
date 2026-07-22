import java.util.*;

public class in1020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(in(a, b));

        sc.close();
    }

    public static boolean in(int a, int b){
        if ( a >= 10 && a <= 20 || b >= 10 && b <= 20){
            return true;
        }
        else{
            return false;
        }
    }
}
