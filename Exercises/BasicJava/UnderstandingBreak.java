class UnderstandingBreak{
	public static void main (String[] args){

		int a =1; 
		for(a=1;;){ // < -- 
			System.out.println(a);
			a++; 
			break; // The only way to exit this for loop is with the break command 
			// break - jump out of the current CODE BLOCK
		} // < -- 
	}
}