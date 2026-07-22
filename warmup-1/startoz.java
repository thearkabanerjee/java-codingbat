import java.util.*;

public class startoz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(oz(str));

        sc.close();
    }

    public static String oz(String str){
        if (str.length() >= 2){
            if (str.charAt(0) == 'o' && str.charAt(1) == 'z'){
                return ("oz");
            }else if(str.charAt(0) == 'o'){
                return ("o");
            }else if( str.charAt(1) == 'z'){
                return ("z");
            }else{
                return ("");
            }
        }
        else{
            return str;
        }
    }
}
