class Student{
String name;
public static void main(String []args){
Student s1=new Student();
s1.name="thiya";
Student s2=s1;
s2.name="riya";
System.out.println(s1.name);
System.out.println(s2.name);
}
}