class Method{
    public void sayhi(){
    System.out.println("hi!!!");
    }
    public static void main(String[] args){
        Method m1=new Method();
        m1.sayhi();
    }
}




//
public class Method{
    public static void sayhi(){
    System.out.println("hi!!!");
    }
    public static void main(String[] args){
        
        sayhi();
    }
}
