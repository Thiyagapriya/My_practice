import java.util.*;
class Main {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("enter size of an array:");
int n=scan.nextInt();
        int mark[]=new int[n];
        for(int i=0;i<mark.length;i++){
System.out.println("enter a element:");
            mark[i]=scan.nextInt();
        }
              System.out.println(Arrays.toString(mark));
    }
} 