
// Esta clase tiene como objetivo demostrar que es posible llamar objetos de otras clases, en este caso el valor de X lo obtenemos de Main.java
public class Second{
	public static void main(String[] args){
		Main myObj = new Main();	
		System.out.println(myObj.x);
	}
}