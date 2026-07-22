import java.util.*;

public class front22 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        
        System.out.println(front(str));
        sc.close();
    }


    public static String front(String str){
        if (str.length() >1){
            String fronttwo = "" + str.charAt(0) + str.charAt(1); 
            return ("" + fronttwo + str + fronttwo);
        }
        else {
            return ("" + str + str + str);
        }
    }
}
