class Employee{
   private String empname;
   private int empid;
   Employee(){
      
      System.out.println("Default constructor");
      empname="Anbu";
      empid=106;
}
   void Employeeinfo(){
      System.out.println("Employee name:"+empname);
      System.out.println("Employee id:"+empid);
   }

}

public class EmployeeData{ 
public static void main(String[] args){
   Employee e1=new Employee();
   e1.Employeeinfo();
   
}
}
