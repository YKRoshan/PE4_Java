public class TransposeString {
    public  String[] transposeString(String input){
        String []words = input.split(" ");
        for(int j=0;j<words.length;j++){
            String temp = words[j];
            String reverse = "";
            for(int i = temp.length() - 1; i >= 0; i--) {
                reverse = reverse + temp.charAt(i);
            }
            words[j]=reverse;
        }
    return words;
    }
//    public static void main(String []args){
//        String []result = transposeString("a quick brown fox jumps over the lazy dog");
//        for(String element:result)
//        System.out.print(element+" ");
//    }
}