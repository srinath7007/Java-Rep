import java.util.Scanner;

class Grading
{
  public static void main(String[] args)
  {
  Scanner scan = new Scanner(System.in);
  int mark = scan.nextInt();
  if(mark>=90)
  {
  System.out.print("your grade is S");
  }
  else if(mark>=80 && mark<90)
  {
  System.out.print("your grade is A");
  }
  else if(mark>=70 && mark<79)
  {
  System.out.print("your grade is B");
  }
  else if(mark>=60 && mark<69)
  {
  System.out.print("your grade is C");
  }
  else
  {
	 System.out.print("FAIL");
  }
  }
  }