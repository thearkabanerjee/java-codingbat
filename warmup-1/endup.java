public class endup {
    public static void main(String[] args){

    }

    public static String caps(String str){
        String newstr = "";
        if (str.length() >3){
            int length = str.length()-1;
            newstr = str.substring(0,length-2);
            for (int i = length -2; i <= length ; i++){
                newstr += Character.toUpperCase(str.charAt(i));
            }
        }else{
            for (int i = 0; i <str.length(); i++){
                newstr += Character.toUpperCase(str.charAt(i));
            }
        }

        return newstr;
    }
}
