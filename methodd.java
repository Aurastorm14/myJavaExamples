public class methodd{
	
	static void trucoteca(String cheats, int likes){
		if(likes>=5){
			System.out.println("Tu cheat: " + cheats + " es legitimo");
		}
		else{
			System.out.println("Tu cheat es fake >:(");
		}
	}
	
	public static void main (String [] args){
		trucoteca("Vida infinita", 100);
	}
}