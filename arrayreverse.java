public class Revarr{
public static void main(String[] args){
int[] a = {1,4,7,2,3,9};
int tmp;
for(int t=0;t<a.length/2;t++){
tmp = a[t];
a[t]=a[a.length-t-1];
a[a.length-t-1]=tmp;
}
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}
}
}
