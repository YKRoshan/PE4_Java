public class ReplaceAllDwithFandLwithT {
    public  String replaceAllDwithFandLwithT(String input){
        input = input.replaceAll("d","f");
        input = input.replaceAll("l","t");
        return input;
    }
//    public static void main(String[] args){
//        String result = replaceAllDwithFandLwithT("daily dry");
//        System.out.println(result);
//    }
}
