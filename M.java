import java.util.*;
class M{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum_o=0,sum_e=0;
for(int i=1;i<=a;i++){
if(i%2==0){
sum_e+=i;
}
else
{
sum_o+=i;
}
}
System.out.println("even:"+sum_e);
System.out.println("odd:"+sum_o);
}
}