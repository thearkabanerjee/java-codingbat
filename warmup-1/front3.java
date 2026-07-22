import java.util.*;
public class front3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String output = front(str);
        for (int i = 0; i < 3; i++){
            System.out.print(output);
        }
        System.out.println();
        sc.close();
    }

    public static String front(String str){
        String newstr = "";
        if (str.length() >= 3){
            for (int i = 0; i < 3; i++){
                newstr += str.charAt(i);
            }
        }else{
            newstr = str;
        }
        
    
        return (newstr);
    }
}
