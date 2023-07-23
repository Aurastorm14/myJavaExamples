public class CatchMe {
  public static void main(String[ ] args) {
    try {												//try
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);				//Esto da error al intentar imprimir algo que no existe
    } catch (Exception e) {								//catch
      System.out.println("Something went wrong.");
    }
  }
}