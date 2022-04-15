public class This{
    int a=4;
    void display()
    {
        int a=9;
        System.out.println(this.a);
        System.out.println(a);
    }
    public static void main(String args[]){
        This obj = new This();
        obj.display();
    }
}
