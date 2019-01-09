public class SortWords {
    public  String[] sortWords(String paragraph){
        //String result = "";
        paragraph=paragraph.toLowerCase();
        String temp;
        String []words = paragraph.split(" ");
        int n = words.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (words[i].compareTo(words[j])>0)
                {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }
//    public static void main(String []args){
//        String []result = sortWords("This is a paragraph");
//        for(String element:result)
//        System.out.print(element+" ");
//    }
}
