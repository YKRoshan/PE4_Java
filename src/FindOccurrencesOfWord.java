import java.util.regex.*;

public class FindOccurrencesOfWord {
    public  String findOccurrencesOfWord(String theRegex, String str2Check){

            Pattern checkRegex = Pattern.compile(theRegex);

            Matcher regexMatcher = checkRegex.matcher( str2Check );
            String result = "";

            while ( regexMatcher.find() ){
                if (regexMatcher.group().length() != 0){
                    result+=( " Found at: " + regexMatcher.start()+"-"+ regexMatcher.end());
                }
            }

            return result;
        }

//    public static void main(String[] args){
//        String input = "She sells seashells by the seashore ";
//        String check = "se";
//        findOccurrencesOfWord(check,input);
//
//    }
}
