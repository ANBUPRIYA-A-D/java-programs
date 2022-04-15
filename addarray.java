import java.io.*;
import java.util.*;
public class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum=0;
        System.out.println("enter the numbers:");
        for(int i=0;i<a.length;i++){
                    
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
      System.out.println(sum);   
    }
}
