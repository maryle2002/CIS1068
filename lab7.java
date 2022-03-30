import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class lab7 { 
    public static void main(String args[])throws FileNotFoundException{
        Scanner input = new Scanner (new File ("jaws.txt"));
        input.useDelimiter(" ");
        while(input.hasNext()){
            String word=input.next();
            System.out.print(southieConvert(word)+" ");
        }
        input.close();
       }


    public static String southieConvert(String word) {
        StringBuilder a=new StringBuilder(word);
        if(word.length()>1 && word.endsWith("a")){
            a.insert(word.length(), 'r');
        }
        else if(word.contains("very")){
            a.replace(a.indexOf("very"), a.indexOf("very")+4, "wick");
            a.insert(a.indexOf("wick")+4,"ed");
        }

        else {
            for (int i = 0; i < word.length() - 1; i++) {
               if (!word.endsWith("s")) {
                if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') &&
                        word.charAt(i + 1) == 'r') {
                         progress(word,a,i);
                    
                }
               }
               if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') &&
                        word.charAt(i+1) == 'r' && word.endsWith("s")) {
                            a.setCharAt(i+1, 'h');
                        }
            }
          }
        return a.toString();
    }



   public static void progress(String word, StringBuilder a, int i) {
           if (i - 1 >= 0 && (word.substring(i - 1, i + 1).equalsIgnoreCase("ee") || word.charAt(i) == 'i')) {
                        a.setCharAt(i + 1, 'y');
                        a.insert(i + 2, "ah");
                    } 
            else if (i - 1 >= 0 && (word.substring(i - 1, i + 1).equalsIgnoreCase("oo"))) {
                        a.setCharAt(i + 1, 'w');
                        a.insert(i + 2, "ah");
            }
            else {
                        a.setCharAt(i+1, 'h');
            }            
   }
}
