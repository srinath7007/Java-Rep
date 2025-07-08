package foundation;

public class noOfchars {

	public static void main(String[] args) {
		
		String scentance="Welcome|to|Amazon|ecomerce|application";
        String[] words=scentance.split("|");
        System.out.println(words[0]);
        
        	
        
        String results=scentance.substring(0, 7);
        System.out.println(results);
        
        
        String results1=scentance.substring(8, 10);
        System.out.println(results1);        
        
        String results2=scentance.substring(11, 17);
        System.out.println(results2);        
        
        String results3=scentance.substring(18, 26);
        System.out.println(results3);
        
        String results4=scentance.substring(27, 38);
        System.out.println(results4);
        
        int count=results.length();
        System.out.println(count);
        
        int count1=results1.length();
        System.out.println(count1);	
        
        int count2=results2.length();
        System.out.println(count2);	
        
        int count3=results3.length();
        System.out.println(count3);	
        
        int count4=results4.length();
        System.out.println(count4);	
	}

}
