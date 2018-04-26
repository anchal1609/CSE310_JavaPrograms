import java.util.*;
import java.io.*;


class Students {
	private String name;
	private int age;
	private int[] marks;
	
	public void setMarks(String name, int age, int[] marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void display() {
		System.out.print("\nName: " + this.name + "\nAge: " + this.age + "\nMarks: ");
		for (int i = 0; i < marks.length; ++i) {
			System.out.print(this.marks[i] + " ");
		}
	}
}


class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Students st = new Students();
		String name;
		int age, n;
		int[] marks;
		
		System.out.print("Enter the name of the student: ");
		name = sc.nextLine();
		System.out.print("Enter the age of the student: ");
		age = sc.nextInt();
		System.out.print("Enter the number of subjects: ");
		n = sc.nextInt();
		
		marks = new int[n];
		
		System.out.print("Enter the marks of each subject space-separated: ");
		for (int i = 0; i < n; ++i) {
			marks[i] = sc.nextInt();
		}
		
		st.setMarks(name, age, marks);
		st.display();
	}
}
