import java.util.*;

public class starthi {

    public static void main(){
        Scanner sc = new Scanner (System.in);
        String isithi = sc.nextLine();
        System.out.println(ishi(isithi));
        sc.close();
    }
    public static boolean ishi(String str){

        if (str.length() > 1) {
            String hi = "" + str.charAt(0) + str.charAt(1);
            if  (hi.equals("hi") || hi.equals("hi ")){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
    }
    
}
