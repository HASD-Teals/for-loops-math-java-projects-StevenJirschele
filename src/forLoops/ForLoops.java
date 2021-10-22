package forLoops;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|\"\"\"\"\"\"\"\"\"|");
		Top(7);
		Bottom(7);
		System.out.println("|\"\"\"\"\"\"\"\"\"|");
		}
	
	public static void Top(int n) {
		for(int a = n; a > 0; a = a - 2) {
			for (int b = (n + 2); a < b; b = b - 2) {
				System.out.print(" ");
			}
				System.out.print("\\");
				for(int c = 0; c < a; c++) {
					System.out.print(":");
				}
				System.out.println("/");
			}
		}
	public static void Bottom(int n) {
		for(int a = 1; a <= n; a = a + 2) {
			for(int b = a; b < (n + 2); b = b + 2) {
				System.out.print(" ");
			}
			System.out.print("/");
			for(int c = 0; c < a; c++) {
				System.out.print(":");
			}
			System.out.println("\\");
		}
	}
}