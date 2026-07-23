import java.util.*;
public class stringE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(strE(str));

        sc.close();
    }

    public static boolean strE(String str){
        int result = 0;
        for (int i = 0; i<= str.length()-1; i++){
            if (str.charAt(i) == 'e'){
                result += 1;
            }
        }
        if (result >= 1 && result <= 3){
            return true;
        }else{
            return false;
        }
    }
}
