package fizzBuzz;

public class fizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i<=100; i++){
			
			if(i %4 == 0 && i%5 ==0 ){
				System.out.println("fizz");
			}
				else if(i%5 ==0){
					System.out.println("buzz");
					
				}
			
				else if(i%4 ==0){
					System.out.println("fizzbuzz");
				}
			
				else{System.out.println(i);
					
				}
		
		}
		
		

	}

}
