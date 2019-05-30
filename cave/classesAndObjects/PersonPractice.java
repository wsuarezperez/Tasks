package classesAndObjects;

public class PersonPractice {

	String hair, color, attitude, name;
	int number;
	
	public static void main(String[] args) {
	PersonPractice president1 = new PersonPractice();
	president1.name="Trump";
	president1.color="white";
	president1.hair="tupee";
	president1.attitude="horrible";
	president1.number=46;
	
	System.out.println("the "+president1.number+ " president is " +president1.name+ " he is a " +president1.color+ " man with a " + president1.hair+ " as a hairstyle and an attitude that is " +president1.attitude);
}
}
