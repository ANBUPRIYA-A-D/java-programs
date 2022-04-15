import java.io.*;
import java.util.*;
public class Digits{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
        int vowels=0,space=0,consonant=0,digit=0;
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else if(ch == ' '){
                space++;
            }
            else if(ch>='0'&&ch<='9' ){
                digit++;
            }
            else{
                consonant++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonant);
        System.out.println(space);
        System.out.println(digit);
     }
}
