/*
Given 10 numbers, print the value if it is odd otherwise print all of the numbers up to the even number e.g. 

1
12
3
1234
5
123456
7
12345678
9
12345678910

*/


class OddOrEven{
	
	public void isEvenOrOdd(){
		int a=1, b=1; 
		while(a<=10){
			if(a%2==0){
				b=1;
				while(b<=a){
					System.out.print(b); 
					b++;
				}
			}
			else{ 
			System.out.print(a);
				
			}
			System.out.println("");
			a++;
			
		}
	}
	
	public static void main(String xyz[]){
		OddOrEven oe = new OddOrEven();
		oe.isEvenOrOdd();
	}
	
}