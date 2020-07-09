package hi;

// What is the output of this code?
class ParentClass{
	private boolean checkValue(int a) {
		return true; 
	}
}


public class ChildClass extends ParentClass{
	public int modifyVal(int val) {
		if(checkValue(val)) {
			return val;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		ChildClass b = new ChildClass(); 
		System.out.println(b.modifyVal(10));
	}
}


/*
 * This code will not compile because although child classes can inherit private methods / members 
 * They cannot be used in Child classes NEW methods
 */

