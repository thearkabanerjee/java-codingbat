public class frontBack{
    public static void main(String[] args){
        String printer = frontback("code");
        System.out.println(printer);
    }

    public static String frontback(String str){
        String newstr = "";
        
        int number = str.length();
        char last = str.charAt(number-1);
        for (int i = 1; i < str.length()-1; i++){
            newstr += str.charAt(i);
        }
        char first = str.charAt(0);
        return (last + newstr + first);
    }
}