class BasicJavaMistakes{
	public static void main(String[] args){
		int A=10; 
		System.out.println(A++); 
		
		for(A=1; A<=10; A++); // Notice the ';'
		System.out.println(A); // 11
		
		int a = 30; 
		if(a>10)
			System.out.println("*");
		
		// Semi colon means end of instruction
		
		//ForLoop:
		//For(initialisation;condition;updation)
		//	Initialisation = 0 or more 
		//	Updation = 0 or more 
		//	Condition = 0 or 1
		
		int i =0; 
		for(i=1; i<=10; i++)
			System.out.println(i); // Print from 1 - 10
			System.out.println("last:" + i); // This is not apart of the for loop it will execute after the forloop so 11
	}
}