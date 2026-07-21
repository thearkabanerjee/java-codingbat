import java.util.*;

public class frontBack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String printer = frontback(input);
        System.out.println(printer);

        sc.close();
    }

    public static String frontback(String str){
        String newstr = "";
        
        // wait i think i can make this better

        if (str.length() > 1){
            int number = str.length();
            char last = str.charAt(number-1);
            for (int i = 1; i < str.length()-1; i++){
                newstr += str.charAt(i);
            }
            char first = str.charAt(0);
            return (last + newstr + first);
        }else{
            newstr = str;
            return str;
        }
        
    }
}