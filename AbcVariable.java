class AbcVariable
{
  static String college ; //static Variable
  static int x = 10 ;//static Variable
  int std_id ;
  public static void main (String []arg)
  {
    AbcVariable a1 = new AbcVariable();
    AbcVariable a2 = new AbcVariable();
    AbcVariable a3 = new AbcVariable();
    a1.std_id = 1;
    a2.std_id = 2;
    a3.college = "Lovely Professional University";
    System.out.println("Student 1st - "+a1.std_id);
    System.out.println("Student 2st - "+a2.std_id);
    System.out.println("Student collage is - "+a3.college);
    System.out.println("Value is - "+x);
    System.out.println("2nd college - "+college);
  }

}
