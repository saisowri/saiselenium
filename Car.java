package motor_vehicle;

public class Car {
	public void driveCar() {
		System.out.println("CAR NAME:Jagwar\t Honda\t BMW\t Audi");
	}
	public void applyBrake() {
		System.out.println("some vehicle comes nearst applyBrake");
		}
	public void  soundHorn() {
		System.out.println("some turning point press soundHorn");
	}
	public String isPuncture() {
		return "weekly 2 times";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		String isPuncture=c.isPuncture();
		System.out.println(isPuncture);

	}

}
