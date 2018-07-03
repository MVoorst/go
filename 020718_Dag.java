import java.util.Random;

public class TweeJuli {
	public static void main (String[] args) {
		Rando();
	}
		
	public static void Rando() {
		int Counter = 0;
		
		Random rand = new Random ();
		for  (int i = 1; i <= 100; i++) {
		int a = rand.nextInt(6) + 1;
			System.out.println(a);
		
			if (a == 1) {
				Counter++;
			}
		}
		System.out.println("Total times number 1: " + Counter);
		
	}
}
