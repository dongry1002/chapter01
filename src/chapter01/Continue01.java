package chapter01;

public class Continue01 {

	public static void main(String[] args) {
		int i = 0; 
		while ( i < 10 ) { 
			
			i++;//이거없으면 무한루프
		    if ( i > 5 ) {
		    
		       continue; 
		   } 
		   System.out.println( i ); 
		
		} 

	}

}
