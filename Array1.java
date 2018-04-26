//Demo haveing main methode create one student class enter its details and pass them to the set details method fo the student class and display by display method
import java.util.*;
class Array1
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    Array1 obj1 = new Array1();
    System.out.println("Enter the number of students - ");
    n = obj.nextInt();
    int i;
    int Stu[] = new int [n];
    obj1.details(name,age,marks);
    obj1.Display();
  }
  void details(String name[50],int age,int marks)
  {
    System.out.println("\nEnter the details of students\n");
    for (i=0;i<n;i++)
    {
        System.out.println("Enter the Name - ");
        name = obj.nextString();
        System.out.println("Enter the Age - ");
        age = obj.nextInt();
        System.out.println("Enter the ID - ");
        id = obj.nextInt();
        System.out.println("Enter the Age - ");
        marks = obj.nextInt();
    }
    void Display()
    {
      for(i=0;i<n;i++)
      {
      System.out.println("Name - "+name);
      System.out.println("Age - "+age);
      System.out.println("ID - "+id);
      System.out.println("Age - "+age);
      }
    }
  }
}
