import java.util.*;

public class backaround {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();

        String output = back(str);

        System.out.println(output);
        sc.close();
    }


    public static String back(String str){
        int number = str.length();
        char Last = str.charAt(number-1);
        return ("" + Last +str + Last);

    }
}
