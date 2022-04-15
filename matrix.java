import java.io.*;
import java.util.*;
public class Matrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];
        System.out.println("enter the values for 1st matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j] = sc.nextInt();
                System.out.println(a[i][j]);
            }
            
        }
        System.out.println("enter the values for 2st matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                b[i][j] = sc.nextInt();
                System.out.println(b[i][j]);
            }
            
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=a[i][j] + b[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("result is "+sum[i][j]);
               
            }
        }
    }
}
