import java.util.*;
class Calculator{
    int a;
    int b;
    Calculator(){
    System.out.println("addition:"+add(5,6));
    System.out.println("subtraction:"+sub(9,5));
    System.out.println("multiplication:"+mul(9,8));
    }
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    public static void main(String []args){
        Calculator c1=new Calculator();
    }
}