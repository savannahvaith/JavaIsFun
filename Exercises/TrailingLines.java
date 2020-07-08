/*
Produce the following output: 
1. 
1,2. 
1,2,3. 
1,2,3,4.
1,2,3,4,5.

*/
class TrailingLines { 

	public void trail(){
		int a=1; 
		int b;
		while(a<=5){
			b=1;
			while(b<=a){
				System.out.print(b);
				if(b+1<= a){
					System.out.print(",");
					b++;
				}else{
					System.out.print(".");
					b++;
				}
			}
		System.out.println("");
		a++;
		}
	}
	
	public static void main(String xyz[]){
		TrailingLines tl = new TrailingLines();
		tl.trail();
	}
}