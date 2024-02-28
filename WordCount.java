import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(){
        File wordcount = new File("wordCount.txt");
        Scanner sc = new Scanner(System.in);
         String words = sc.nextLine();

         int count =0;

           for(int i=0; i<words.length(); i++){
                 char ch = words.charAt(i);
                count++;
                
             }

             System.out.println(count); 
              

        }
    }

