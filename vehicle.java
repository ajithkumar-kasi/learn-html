package mypack1;

	class vehicle{
		  protected String brand = "Ford";
		  public void honk() {
		    System.out.println("Tuut, tuut!");
		  }
		}

		class Car extends vehicle {
		  private String modelName = "Mustang";
		  public static void main(String[] args) {
		    Car myFastCar = new Car();
		    myFastCar.honk();
		    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
		  
		}
}
