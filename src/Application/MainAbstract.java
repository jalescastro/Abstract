package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.Enum.Color;

public class MainAbstract {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List <Shape> list = new ArrayList<>();
		
		
		System.out.print("Enter the number os shapes: ");
		int numShape = scan.nextInt();
		
		for (int i = 0; i < numShape; i++) {
			
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.print("Rectangle or Circle (c/r)? ");
			char ch = scan.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next());
			
			if(ch == 'r') {
				System.out.print("Widht: ");
				double width = scan.nextDouble();
				System.out.print("Height: ");
				double height = scan.nextDouble();
				
				list.add(new Rectangle(width, height));
				
			}else {
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				
				list.add(new Circle(radius));
			}
			
				
				
		}
		
		System.out.println("SHAPES AREAS");
		
		int i = 0;
		for (Shape shape : list) {
			i++;
			System.out.println(i + "° Shape");
			
			System.out.println(String.format("%.2f", shape.area()));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	scan.close();}

}
