class gi{
public static void main(String []args){
String s="hello";
int i=0;
int j=s.length()-1;
Boolean ispalindrome=true;
while(i<j){
if(s.charAt(i)!=s.charAt(j))
{
ispalindrome=false;
break;
}
i++;
j--;
}System.out.println(ispalindrome);
}
}