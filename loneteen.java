import java.util.*;

public class loneteen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(teen(a, b));
        sc.close();
    }


    public static boolean teen(int a, int b){
        if (a >= 13 && a <= 19 && b >= 13 && b <= 19){
            return false;
        }
        else if (a >= 13 && a <= 19 ||(b >= 13 && b <= 19)){
            return true;
        }
        else{
            return false;
        }
    }
}
