import java.util.regex.*;

public class FindNameHarry {
        public  boolean findNameHarry(String input, String regExp){

        Pattern pattern = Pattern.compile(regExp);

        Matcher matcher = pattern.matcher(input);
       while ( matcher.find() ){
            if (matcher.group().length() != 0){
                return true;
            }
        }
        return false;
    }

//    public static void main(String []args){
//            String input = "This is Harry.";
//            String input1 = "This is Henry.";
//            boolean result = findNameHarry(input,"Harry");
//            System.out.println("Is Harry here ?"+result);
//    }
}
