import java.util.*;
class div{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<=a;i++){
for(int j=1;j<=a;j++){
if(i==3||j==3||(i==2&&j==4)||(i==4&&j==2)||i+j==4||i+j==8){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}