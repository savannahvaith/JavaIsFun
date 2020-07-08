class AddTogether{

	// Given two numbers, add the single digits together without converting to a string
	// 56 = 5+6 = 11
	// 70 = 7+0 = 7
	
	public int calculate(int num){
		System.out.println(num/10); // Prints first digit
		System.out.println(num%10); // Prints second digit
		return ((num/10) + (num%10));
	}
	
	public static void main(String xyz[]){
		AddTogether add;
		add = new AddTogether(); 
		System.out.print(add); 
	}
}