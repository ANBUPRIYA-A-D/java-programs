class A{
    void A()
    {
        int a =1;
        System.out.println(a);
    }
    void A(int a){
        System.out.println(a);
    }
}
public class MOverload{
    public static void main(String args[]){
        A obj1=new A();
        obj1.A();
        
        obj1.A(8);
    }
}
