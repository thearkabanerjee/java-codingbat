import java.util.*;

public class everyNth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(nth(str, i));
        sc.close();
    }

    public static String nth(String str, int i){
        String newstr = "";

        for (int j = 0; j <= str.length()-1; j++){
            if(j % i == 0){
                newstr += str.charAt(j);
            }
        }
        return newstr;
    }
}
