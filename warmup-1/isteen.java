import java.util.Scanner;

public class isteen {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println(teen(a, b, c));
        sc.close();
    }

    public static boolean teen(int a, int b , int c){
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19){
            return true;
        }
        else{
            return false;
        }
    }
}
