class Divrange
{
 public void range(int a)
 {
 for(a=100;a<=1000;a++)
 {
	 int div;
 div=a%8;
 if(div==0)
 {
 System.out.println(a);
 }
 }
 }
 public static void main(String[] args)
 {
 Divrange obj=new Divrange();
 obj.range(100);
 }
 }