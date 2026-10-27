import java.util.*;
class g{
public static void main(String []args){
Scanner scan=new Scanner(System.in);
int arr[]={10,20,10,40,20,20,10};
int key=scan.nextInt();
int count=0;
for(int i:arr){
if(key==i){
count++;
}
}
System.out.println(key+" occurs "+count+" times");
}
}