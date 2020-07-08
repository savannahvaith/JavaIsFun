/*

1)Create a class called Animal, Animal should have at least 
	2 methods of your choosing and 3 variables.

2) Now create 3 more classes that inherit from Animal, 
each of these classes should have their own methods and variables 
as well as the methods that they inherit from Animal. 
Ensure that your inheritance hierarchy makes sense.
*/


class Animal{
	// Three variables
	private String name; 
	private int numberOfFeet; 
	private boolean isHungry = true;

	// Two methods
	public String printName(){
		return "Hello my name is" + this.name;
	}
	
	public String feedMe(){
		String result=""; 
		if(!this.isHungry){
			result=this.name + " has eaten"; 
		}else{
			result= this.name + " is about to eat"; 
			this.isHungry = true;
		}
		return result;
	}
	public Animal(){}
	
	// Getters and setters
	public void setName(String name){
		this.name = name; 
	}
	
	public String getName(){
		return this.name; 
	}
	
	public void setFeet(int numberOfFeet){
		this.numberOfFeet = numberOfFeet;
	}
	
	public int getFeet(){
		return this.numberOfFeet; 
	}
	
	public void setHunger(boolean hunger){
		this.isHungry = hunger;
	}
	
	public boolean getHunger(){
		return this.isHungry;
	}
}