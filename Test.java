import java.util.Scanner;

public class Test {
	public static void main (String[] args){
		String palabras = "El duende melodias asi es";
		int cuenta = palabras.split("\\s").length;
		System.out.println(cuenta);
	}
}