class Count{
public static void main(String[] args)
{
int total=100;
int count=3;
total/=count;
total*=count;
int lost=100-total;
total+=lost*10;
count-=lost;
total%=50;
System.out.println(total+""+count+""+lost);
}
}