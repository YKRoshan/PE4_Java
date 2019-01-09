public class CountOccurrencesOfChar {
    public  int countOccurrencesOfChar(String input,String character){
        int count = input.length() - input.replaceAll(character, "").length();
        return count;
    }

//    public static void main(String [] args){
//        int c=countOccurrencesOfChar("This is an Example Of The Character","a");
//        System.out.println(c);
//    }
}


