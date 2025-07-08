package foundation;

public class Palindrone {

	public static void main(String[] args) {
		
		String s= "RACECAR";
		String r= "";
		char ch;
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			r=ch+r;
		}
		boolean result=s.equals(r);
		System.out.print(result);
	}

}
