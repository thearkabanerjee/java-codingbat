import java.util.*;

public class mixstart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(count(str));
        sc.close();
    }

    public static boolean count(String str){

        boolean result = false;
        if ( str.length() >= 3){
            if (str.charAt(1)== 'i' && str.charAt(2) == 'x'){
                result = true;
            }
        }

        return result;
    }
}
