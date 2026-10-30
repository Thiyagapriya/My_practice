class Student{
    String name;
    String dept;
    int age;
    void display(){
        System.out.println("name:"+name);
        System.out.println("dept:"+dept);
        System.out.println("age:"+age);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="thiya";
        s1.dept="CSE";
        s1.age=45;
        s1.display();
    }
}