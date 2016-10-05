import java.util.Scanner ;

public class LeapYears {
	
	
	
	public static void main(String[] args) {
	
		System.out.print("Voer het jaartal in:");
		Scanner scan = new Scanner (System.in);
       
		
		//Uitzoeken of jaar een schrikkeljaar is:
        int jaar = 0;         
     
         jaar = scan.nextInt();	
    
         
		 
                
        //Het jaar moet deelbaar zijn door 400 en door 4 te delen zijn. En het moet niet deelbaar zijn door 100
        
               if((jaar % 400 == 0) || ((jaar % 4 == 0) && (jaar % 100 != 0)))
                System.out.println("jaar " + jaar + " is een schrikkeljaar");
        else
                System.out.println("jaar " + jaar + " is geen schrikkeljaar");
		}
	}
		
	
	

