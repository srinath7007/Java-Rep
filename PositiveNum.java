import java.util.Scanner;
class PositiveNum
{
    public static void main(String[] args)
	{
	Scanner scan =new Scanner(System.in);
	int num=scan.nextInt();
	
	if(num>=0)
	{
	System.out.println("Positive");
	}
	else
	{
	System.out.println("Negative");
	}
	}
	}