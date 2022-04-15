class A{
    A()
    {
        int a =1;
        System.out.println(a);
    }
    A(int a){
        System.out.println(a);
    }
}
public class COverload{
    public static void main(String args[]){
        A obj1=new A();
        A obj=new A(4);
    }
}
