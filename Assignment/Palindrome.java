import java.util.*;
public class Palindrome {

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.println("enter your string");
     String ostr= sc.nextLine();

     String str = ostr.toLowerCase();
        String ans = "";
        char ch;
        for(int i=str.length()-1; i>=0; i--){
            ch=str.charAt(i);
            ans =  ans + ch;
         }
    if(str.equals(ans)){
        System.out.println("true");
     }
     else{
        System.out.println("false");
     }
     
   }

}


