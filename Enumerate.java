enum Level{
	Low,
	Medium,
	High,
}


public class Enumerate{
	public static void main(String [] args){
		Level myVar = Level.Low;
		switch(myVar) {
			case Low:
				System.out.println("Low");
				break;
			case Medium:
				System.out.println("Medium");
				break;
			case High:
				System.out.println("High");
				break;
			default:
				System.out.println("Out of bounds");
		}
	}

}

