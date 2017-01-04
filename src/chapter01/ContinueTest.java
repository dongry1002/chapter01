package chapter01;

public class ContinueTest {

	public static void main(String[] args) {
		
		for(int i=0; i<20; i++){
			
			/*if(i%2 !=0){
				System.out.println(i);	
			}*/
			if(i%2 == 0){  //가독성이 좋아요~~~ 
				continue;
			}
			
			
			System.out.println(i);
			
		}
	}

}
