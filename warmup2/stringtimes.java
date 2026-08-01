package warmup2;

import java.util.Scanner;

public class stringtimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(stringTimes(str, n));
        sc.close();
    }

    public static String stringTimes(String str, int n) {
        String restr = "";
        for (int i= 0; i< n ; i++){
        restr += str;
        }  
        return restr;
    }
}
