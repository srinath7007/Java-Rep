package foundation;

public class reverse {

	public static void main(String[] args) {
		String s="Full Stack Development";
		String r="";
		char ch;
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			r=ch+r;
		}
		
		System.out.print(r);
		
	}

}
