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
			double X1 = sc.nextDouble();
			double Y1 = sc.nextDouble();

			System.out.print("Enter the  Co-ordinates of end point ( x2 , y2 ) = ");
			double X2 = sc.nextDouble();
			double Y2 = sc.nextDouble();

			double length = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
			System.out.println("Length of Line = " + length);
		}
}