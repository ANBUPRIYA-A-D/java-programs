import java.io.*;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the string:");
         String str=sc.nextLine();
         int count=0;
       
       //String str="asda";
        int n=str.length();
        int[] a = new int[20];
        for(int i=0;i<=str.length();i++){
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(a[i]==(a[j])){
                   count++ ;
                }
                else{
                    System.out.println("no");
                }
                
            }
           
     }
      System.out.println(count);
}
}
