class Iterators{
	public void count(){
	int i=0; 
	for(i=1; i<=10; i++){
		System.out.println("inner "+ ++i);
	}
	System.out.println("outer "+ i++);
	}
	
	public static void main (String xyz[]){
		Iterators i = new Iterators(); 
		i.count();
	}
}