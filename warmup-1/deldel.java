import java.util.*;

public class deldel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(del(str));

        sc.close();
    }

    public static String del(String str){
        // there goes the rest of it
        String newstr = "";

        if (str.length() >= 3 ){
            if (str.charAt(1) == 'd' && str.charAt(2) == 'e' && str.charAt(3) == 'l'){
                for (int i = 4; i<= str.length()-1; i++){
                    newstr += str.charAt(i);
                }
            }
            newstr = (str.charAt(0) + newstr);
        }else{
            newstr = str;
        }
        return newstr;
    }
}