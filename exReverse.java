public class exReverse{
	public static void main(String[] args){
		String originalStr = "TheLessIKnowTheBetter";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {		//ciclo hasta que las i's sean mayores al tamano del string
			reversedStr = originalStr.charAt(i) + reversedStr;		//Toma el primer caracter ussando charAt(x), y lo suma. La proxima vuelta recorrera el valor inicial 
		}
		System.out.println("Reversed string: "+ reversedStr);
	}
}