public class Palindrome{
public static void main(String[] args){
String str="anbu";
String nstr="";
char ch;
for (int i=0; i<str.length(); i++){
ch=str.charAt(i);
nstr=ch + nstr;
}
if(str.equals(nstr)){
System.out.println("palindrome");
}
else{
System.out.println("not a palindrome");
}
}
}
