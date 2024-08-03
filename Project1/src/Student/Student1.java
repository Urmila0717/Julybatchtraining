package Student;

public class Student1 {
int rollno;	
int age;
int marks;
public void display1()
{
	System.out.println("Welcome to all of you" +  rollno);
}
public void display2()
{
	System.out.println("Automation is easy");
}
public static void main(String[] args) {
	Student1 urmila=new Student1();
	urmila.display1();
	urmila.rollno= 07;
	urmila.age=30;
	urmila.marks=100;
	
	System.out.println("Roll no is" + urmila.rollno);
	System.out.println("Age" + urmila.age);
	
	urmila.display1();
	urmila.display2();
}
}
	
			
			
	


