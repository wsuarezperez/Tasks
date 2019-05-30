package gettersAndReturnValues;

public class GetMethod {
//a get method gets information from one place and brings it to you
//it will have its own method
	String hair;
	int people;

	void speak() {
		System.out.println("my hair is not straight it is " + hair);
	}

	int getPeople() {
		return people;
	}

	String getHair() {
		return hair;
	}

	public static void main(String[] args) {
		GetMethod person = new GetMethod();
		person.hair = "curly";
		person.people = 3;

		String hair= person.getHair();
		int people=person.getPeople();
		
		System.out.println("the amount of people is " + people);
		System.out.println("my neighbor hair is "+hair);
	
	}
}