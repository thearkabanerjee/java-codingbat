import java.util.*;


public class intmax {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(max(a, b, c));
        sc.close();
    }

    public static int max(int a, int b, int c){
        int max = 0;
        if (a >= b && a>= c){
            max = a;
        }else if (b >= a && b >= c){
            max = b;
        }else{
            max = c;
        }


        return max;
    }
}
