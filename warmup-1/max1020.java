import java.util.*;

public class max1020{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println(max(a, b));
        sc.close();
    }

    public static int max(int a , int b){
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20 ){
            if (a > b){
                return a;
            }else{
                return b;
            }
        }
        else if(a >= 10 && a<= 20 || (b >= 10 && b <= 20)){
            if (a >= 10 && a<= 20){
                return a;
            }else{
                return b;
            }
        }else{
            return 0;
        }
    }
}
