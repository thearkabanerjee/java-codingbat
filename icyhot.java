import java.util.Scanner;

public class icyhot {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(icy(a,b));
        sc.close();
    }

    public static boolean icy(int a, int b){
        if ((a > 100 && b <0) || ( a < 0 && b >100)){
            return  true;
        }
        else {
            return false;
        }
    }
}
