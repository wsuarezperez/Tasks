package eclipse;

public class SeventyNine {
	/*
	 * For you to do 
create one method without any parameters  
method name as newLine
and write the logic for that method in println statement 
as "newLine method implementation"
in main method try to call that method three times so you 
can have 3 outputs of "newLine method implementation"
	 */
	void newLine () {
		System.out.println("newLine method implementation");
	}
	public static void main(String[] args) {
		SeventyNine obj = new SeventyNine();
		obj.newLine();
		obj.newLine();
		obj.newLine();
	}
	
}
