import java.util.*;
class ConvertBinary{


      public static String binaryConvertor(int num){

        String s ="";
                 
                  while(num>0){
                       int remainder = num%2;
                       s = s+remainder;
                       num = num/2;
                  }

                 String binarys ="";
                 for(int j=s.length()-2; j>=0; j-- ){
                    char ch = s.charAt(j);
                    binarys =binarys+ch;
                 }

                 return 1+binarys;
      }


    public static void main(String args[]){
             Scanner sc = new Scanner(System.in);
              int num = sc.nextInt();
             String binarynum = binaryConvertor(num);
             System.out.println(binarynum);

             
    }
}