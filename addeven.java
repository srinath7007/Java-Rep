class addeven
{
public void sri(int num)
{
 int sum;
 sum = (num%2);
 if(sum==0)
 {
 System.out.print("Even");
 }
 else
 {
 System.out.print("Add");
 }
 }
 public static void main(String[] args)
 {
 addeven obj=new addeven();
 obj.sri(333);
 }
}
 