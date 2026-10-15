import java.util.*;
class thiya{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int reverse=0;
for(int i=a;i>0;i/=10)
{
reverse*=10;
reverse+=i%10;
}
if(reverse==a){
System.out.println("true");
}
else{
System.out.println("false");
}
}
}