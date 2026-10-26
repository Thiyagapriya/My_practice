import java.util.*;
class ar{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int arr[]=new int[n];
System.out.println("enter "+n+" elements:");
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();
}
int large=0;
for(int i=0;i<arr.length;i++){
if(large<arr[i]){
large=arr[i];
}
}
System.out.println(large);
}
}
