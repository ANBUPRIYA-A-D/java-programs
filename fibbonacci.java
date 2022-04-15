public class Fibbonacci{
public void fibonacciRecursion(int n){
if(n=0){
return n;}
else{
return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
}
}
public static void main(String[] args){
int maxNumber=10;
System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
	for(int i = 0; i < maxNumber; i++){
			System.out.print(fibonacciRecursion(i) +" ");
		}
}
	}
