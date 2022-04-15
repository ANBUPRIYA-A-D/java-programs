public class Main{
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<n;i++){
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int i){
        if(i==0){
            return 0;
        }
        if(i==1){
            return 1;
        }
        return fibonacci(i-2)+fibonacci(i-1);
    }
}
