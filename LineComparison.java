package LineComparison;

import java.util.Scanner;

/**
	 * Program to calculate length of line based on a point consisting of (x, y)
	 * co-ordinates using the Cartesian system.
	 * 
	 * @author : Snehal Nakade
	 *
	 */
	public class LineComparison {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the  Co-ordinates of start point ( x1 , y1 ) = ");
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();

			System.out.print("Enter the  Co-ordinates of end point ( x2 , y2 ) = ");
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();

			double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
			System.out.println("Length of Line = " + length);
		}
}
