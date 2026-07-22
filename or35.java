import java.util.*;

public class or35 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        boolean result = whynot(number);

        System.out.println(result);
        sc.close();
    }

    public static boolean whynot(int i){
        if (i % 5 == 0 || i % 3 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
