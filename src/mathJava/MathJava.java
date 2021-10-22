package mathJava;
import java.util.Scanner;
import java.lang.Math;
public class MathJava {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc();
	}
	public static void Calc() {
		System.out.println("Pick a shape to calculate");
		System.out.println("1 = Cuboid");
		System.out.println("2 = Cube");
		System.out.println("3 = Right Circular Cylinder");
		System.out.println("4 = Right Circular Cone");
		System.out.println("5 = Sphere");
		System.out.println("6 = Hemisphere");
		
		System.out.print("Please pick a number: ");
		int shapeNumber = input.nextInt();
		String shape = "";
		switch(shapeNumber) {
		case 1:
			cuboid();
			break;
		case 2:
			cube();
			break;
		case 3:
			rightCircularCylinder();
			break;
		case 4:
			rightCircularCone();
			break;
		case 5:
			sphere();
			break;
		case 6:
			hemisphere();
			break;
		}
		System.out.println(shape);
		yesOrNo();
	}

	public static void cuboid() {
		double h;
		double l;
		double b;
		System.out.println("Cuboid");
		System.out.println("Please give a height, a length, and a base");
		System.out.print("Height: ");
		h = input.nextInt();
		System.out.print("Length: ");
		l = input.nextInt();
		System.out.print("Base: ");
		b = input.nextInt();

		double volume = h * l * b;
		double surfaceArea = 2 * Math.pow(b, 2) * Math.pow(h, 2) * l;
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + surfaceArea);
	}
	public static void cube() {
		double l;
		System.out.println("Cube");
		System.out.print("Length: ");
		l = input.nextInt();

		double volume = l * l * l;
		double surfaceArea = 6 * Math.pow(l, 2);
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + surfaceArea);
	}
	public static void rightCircularCylinder() {
		double r;
		double h;
		System.out.println("Right Circular Cylinder");
		System.out.print("Radius: ");
		r = input.nextDouble();
		System.out.print("Height: ");
		h = input.nextDouble();
		
		double volume = Math.PI * Math.pow(r, 2) * h * 100;
		double surfaceArea = 2 * Math.PI * r * (r + h) * 100;
		
		volume = Math.round(volume);
		surfaceArea = Math.round(surfaceArea);
		
		System.out.println("Volume: " + volume / 100);
		System.out.println("Surface Area: " + surfaceArea / 100);
	}
	public static void rightCircularCone() {
		double r;
		double h;
		double l;
		System.out.println("Right Circular Cone");
		System.out.print("Radius: ");
		r = input.nextInt();
		System.out.print("Height: ");
		h = input.nextInt();
		System.out.print("Length: ");
		l = input.nextInt();
		
		double volume = Math.PI * Math.pow(r, 2) * h / 3.0 * 100;
		double surfaceArea = Math.PI * r * (l + r) * 100;
		
		volume = Math.round(volume);
		surfaceArea = Math.round(surfaceArea);
		
		System.out.println("Volume: " + volume / 100);
		System.out.println("Surface Area: " + surfaceArea / 100);
	}
	public static void sphere() {
		int r;
		System.out.println("Sphere");
		System.out.print("Radius: ");
		r = input.nextInt();
		
		double volume = 4.0/3.0 * Math.PI * Math.pow(r, 3) * 100;
		double surfaceArea = 4 * Math.PI * Math.pow(r, 2) * 100;
        
		volume = Math.round(volume);
		surfaceArea = Math.round(surfaceArea);
		
		System.out.println("Volume: " + volume / 100);
		System.out.println("Surface Area: " + surfaceArea / 100);
	}
	public static void hemisphere() {
		int r;
		System.out.println("Hemisphere");
		System.out.print("Radius: ");
		r = input.nextInt();
		
		double volume = 2.0/3.0 * (Math.PI * Math.pow(r, 3) * 100);
		double surfaceArea = 3 * Math.PI * Math.pow(r, 2) * 100;
		
		
		volume = Math.round(volume);
		surfaceArea = Math.round(surfaceArea);
		
		System.out.println("Volume: " + volume / 100);
		System.out.println("Surface Area: " + surfaceArea / 100);
	}
	public static void yesOrNo() {
		System.out.println("Would you like to continue?");
		System.out.println("1 = Yes");
		System.out.println("2 = No");
		System.out.print("Please select a number: ");
		int temp = input.nextInt();
		if(temp == 1) {
			System.out.println();
			Calc();
		}
		else if(temp == 2) {
			System.out.println();
			System.out.print("Thank for your time");
		}
		else {
			System.out.println();
			System.out.print("Sorry this is not an option");
			System.out.println();
			System.out.println();
			yesOrNo();
		}
	}
}