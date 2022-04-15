
public class Match{
    public static void main(String[] args){
    
       int[] a ={1,2,3,4,1,4,8,9};
       for (int m=0;m<(a.length);m++){
           for(int n=m+1;n<a.length;n++){
               if(a[m]==a[n]){
                   System.out.println(a[m]);
               }
           }
       }
    }
}
