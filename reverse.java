public class Reverse{
public static void main(String arg[]){
String str="Hello";
char ch;
String nstr = "";
for(int i=0; i<str.length(); i++)
{
ch=str.charAt(i);
nstr=ch+nstr;
System.out.println(nstr);
}

}
}
