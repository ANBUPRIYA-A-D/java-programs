import java.io.*;
import java.util.Scanner;
 
class Pal {
    public static void main (String[] args) {
       
        String str= "aba", nstr="";
        char ch; 
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
if(str.equals(nstr)){
System.out.println("palindrome");
}
else{
System.out.println("not a palindrome");
}
    }
}
 
