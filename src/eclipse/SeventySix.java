package eclipse;

public class SeventySix {
	
	String carColor, carName;
	int carModelYear;
	
	public static void main (String []args) {
		
		SeventySix car1 = new SeventySix();
		car1.carColor= "Black";
		car1.carModelYear= 2019;
		car1.carName="BMW";
		
		System.out.println("Car color is "+car1.carColor+ " and car model year is "+car1.carModelYear+ " and car name is "+car1.carName);
		
		SeventySix car2 = new SeventySix();
		car2.carColor= "White";
		car2.carModelYear=2018;
		car2.carName="Toyota";
		
		System.out.println("Car color is "+car2.carColor+ " and car model year is "+car2.carModelYear+ " and car name is "+car2.carName);

		
	}

}
