 
 public class DiamondShape {

	public static void main(String[] args) {
		int start, asterisk;
		
		start = 0;
		while (start <=5 ){
			asterisk = 1 + start;
			start ++;
			if(asterisk == 1 )
			System.out.println("  *");
			
			if(asterisk ==2)
			System.out.println("");
			
			if (asterisk == 3)
		    System.out.println(" ***");
			
			if (asterisk == 4)
			System.out.println("");	
			
			if( asterisk == 5)
			System.out.println("*****");		
		 }
		
		start = 5;
		while( start >=5){
			asterisk = 1 + start;
			start ++;
			if (asterisk == 6)
			System.out.println("");	
			
			if (asterisk == 7)
			System.out.println(" ***");	
			
			if (asterisk == 8)
			System.out.println("");	
			
			if (asterisk == 9)
			System.out.println("  *");	
					
		}
			
	}

 }

