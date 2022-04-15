import java.io.*;
import java.util.*;
public class Ascending{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:\n");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter no. of elements you want in array:"+n+"\n");
        System.out.println("enter the number");
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
            System.out.print("Ascending Order:");
        for (int i = 0; i < n ; i++) 
        {
            System.out.print(a[i] + ",");
        }
        
        }
    }
