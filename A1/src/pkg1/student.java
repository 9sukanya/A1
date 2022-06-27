package pkg1;

public class student 
{
    int age=29;
    int rollno=11;
    
    public void display1()
    {
    	System.out.println("welcome to all");
    }
    public void display2()
    {
    	System.out.println("automation is very easy");
    }
    public static void main(String[] args)
    {
    	student s=new student();
    	s.display1();
    	s.display2();
        System.out.println(s.age);
        System.out.println(s.rollno);
    }
    
}
