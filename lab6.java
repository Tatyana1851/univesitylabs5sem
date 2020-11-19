import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab6 {
    public static void main(String args[]){
        System.out.println();
        System.out.println("Задача №1");
        System.out.println(bellNumber(6));
        System.out.println();
        System.out.println("Задача №2");
        System.out.println(translateWord("Crocodile"));
        System.out.println(translateWord("Apple"));
        System.out.println(translateSentence("Every day Party"));
        }
    static int bellNumber(int number){
        int[][] massive=new int[number][number];
        massive[0][0]=1;
        for(int i=1;i<number;i++){
            massive[i][0]=massive[i-1][i-1];
            for(int j=1;j<=i;j++){
                massive[i][j]=massive[i-1][j-1]+massive[i][j-1];
            }
        }
        return (massive[number-1][number-1]);
    }
   /* static void translateWord(String string){
        String regex = "^[qwrtypsdfghjklzxcvbnm]*";
        String subst = "";
        String firstPart="";
        String secondPart="";

        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {secondPart=matcher.group();}
        firstPart = matcher.replaceAll(subst);

        if(secondPart==""){System.out.println(firstPart+secondPart+"yay");}
        else{System.out.println(firstPart+secondPart+"ay");}
    }*/
   static String translateWord(String word) {
       String finword = "";
       String first=word.substring(0, 1);
       int up_down=0;
       int sog=0;
       String up="";
       word = word.trim();
       int por = 1;
       String[] glas = new String[]{"a", "e", "i", "o", "u", "y"};
       String[] soglas = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
       if(first.toUpperCase()==first){
           up_down=1;
           word=word.toLowerCase();
       }else{
           up_down=0;
       }
       for(int i = 0; i < glas.length; i++){
           if(glas[i]. equals(word.substring(0, 1))){
               finword=word+"yay";
           }
       }
       for(int k = 0; k < soglas.length; k++){
           if(soglas[k]. equals(word.substring(por-1, por))){
               finword = finword+word.substring(por-1, por);
               por++;
               k=0;
               sog=1;
           }
       }
       if(sog==1){
           finword=word.substring(por-1)+finword+"ay";
       }
       if(up_down==1){
           up=finword.substring(0,1).toUpperCase();
           finword=up+finword.substring(1);
       }
       return (finword);
   }
   static String translateSentence(String first_words) {
        String final_words = "";
        String[] words = first_words.split("\\s+");
        for (int k = 0; k < words.length; k++) {
            words[k] = words[k].replaceAll("[^\\w]", "");
        }
        for (int i = 0; i < words.length; i++) {
            final_words = final_words + translateWord(words[i]) + " ";
        }
        return (final_words);
   }

}
