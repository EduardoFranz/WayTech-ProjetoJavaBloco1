package ProjetoBloco1;

public class Loading {

	public static void main(String[] args) {
		
	}
	
	public static void loading() throws InterruptedException {
		
		System.out.println(" ");
		for(int i = 0; i < 90; i++) {
			System.out.print("-");
			Thread.sleep(15);
		}System.out.println(" ");
	}
}
