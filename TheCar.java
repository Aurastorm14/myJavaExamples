public class TheCar{
	//metodos
	public void fullThrottle(){
		System.out.println("MAX SPEED!!!");
	}
	
	public void speed(int maxSpeed){
		System.out.println("Max Speed is: " + maxSpeed);
	}		
	
	//main
	public static void main(String[] args){
		TheCar myCar = new TheCar();
		myCar.fullThrottle();
		myCar.speed(200);
	}
}