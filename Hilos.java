	public class Hilos extends Thread{
		public static void main(String[] args) {
			int x = 0;
			Hilos thread = new Hilos();
			thread.start();
			while(x!=7){
				System.out.println("This code is outside of the thread");
				x++;
			}
		}
  
		public void run() {
			System.out.println("This code is running in a thread");
		}
	}