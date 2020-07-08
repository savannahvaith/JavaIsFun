
class AnimalRunner{
	public static void main(String xyz[]){
		Animal ani = new Animal(); 
		ani.setName("Milo"); 
		System.out.println(ani.feedMe());
		ani.setHunger(true); 
		System.out.println(ani.getHunger()); 
	}
}