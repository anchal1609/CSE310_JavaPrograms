class Employee
{
	float salary = 4000;
}
class Programmer extends Employee
{
	int bounus = 1000;
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is : "+p.salary);
		System.out.println("bounus of Programmer is: "+p.bounus);
	}
}