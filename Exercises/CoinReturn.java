/* 
	Create a coin return system that returns the correct change given an amount 
	E.g. if i bought something for £2 and I gave the cashier £100 I would expect:
	1 x £50 note
	2 x £20 note
	0 x £10 note
	1 x £5 note
	1 x £2 coin
	1 x £1 coin
*/
class CoinReturn{	
	public String calculateChange(int purchasePrice, int moneyGiven){
		// Calculate the change required 
		int change=0; 
		change = moneyGiven - purchasePrice;
		
		int n50 =0, n20 =0, n10 =0, n5=0, n2=0, n1 =0; 
		if(change >=50){
			n50 = change/50; 
			change %= 50;
		}
		if(change >=20){
			n20 = change/20; 
			change %= 20;
		}
		if(change >=10){
			n10 = change/10; 
			change %= 10;
		}
		if(change >=5){
			n5 = 1; 
			change %= 5;
		}
		if(change >=2){
			n2 = change/2; 
			change%= 2;
		}
		if(change >=1){
			n1 = change/1; 
			change%= 1;
		}
		return "Your change is: \n" + n50 + " x £50\n" + n20 + " x £20\n"+ n10 + " x £10\n"+ n5 + " x £5\n"+ n2 + " x £2\n"+ n1 + " x £1\n";
	}
	
	public static void main(String xyz[]){
		CoinReturn cr = new CoinReturn();
		try{
			System.out.println(cr.calculateChange(Integer.parseInt(xyz[0]),Integer.parseInt(xyz[1])));
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("Please supply two arguments as parameter");
		}
	}
}