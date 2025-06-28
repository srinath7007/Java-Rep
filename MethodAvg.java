class MethodAvg

{


public void add( float a,float b,float c)

{

double d;

d=((a+b+c)/3);

System.out.println(d);

}

public static void main(String[] args) 
{
	MethodAvg avg = new MethodAvg();
    avg.add(2,3,2);
     avg.add(10,20,30);
    avg.add(23,33,4);

}

}