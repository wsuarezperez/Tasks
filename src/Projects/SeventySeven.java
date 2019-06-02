package eclipse;

public class SeventySeven {

	String breed, name, color;
	
	void bark() {
		System.out.println("can bark");
	}
	void run() {
		System.out.println("can run");
	}
	void play() {
		System.out.println("can play");
	}
	
	
	
	public static void main(String[] args) {
		SeventySeven dog1=new SeventySeven();
		
		dog1.breed="Husky";
		dog1.color="Black";
		dog1.name= "Tom";
		dog1.bark();
		dog1.run();
		dog1.play();
		
		
		
		SeventySeven dog2 = new SeventySeven();
		
		dog2.breed= "Bulldog";
		dog2.color= "Orange";
		dog2.name= "Joe";
		dog2.bark();
		dog2.run();
		dog2.play();
		
		
		
		SeventySeven dog3 = new SeventySeven();
		
		dog3.breed="Beagle";
		dog3.color= "Brown";
		dog3.name= "Diggie";
		dog3.bark();
		dog3.run();
		dog3.play();
	}
	}

