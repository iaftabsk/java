package day2;

public class student {
    String name;
    byte id;
    byte sclass;
    
    public static void main(String[] args) {
        student s1=new student();
        System.out.print("Hello World;");
       s1.name="xyz";
       s1.id=1;
       s1.sclass=10;

       System.out.println("Name :"+s1.name);
       System.out.println("id :"+s1.id);
       System.out.println("Class:"+s1.sclass);
    }
}
