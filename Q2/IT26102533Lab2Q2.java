public class IT26102533Lab2Q2{
	
	public static void main(String[] args) {
		
		double sideLength = 10.0;
		double perimSquare = 4 * sideLength;
		
		// Perimter of the square = circumference of the circle
		// Assume length of square = l , Radius of the circle = r
		// 4 * l = 2 * 22/7 * r
		// r = 4 * l / ( 2 * 3.14 )
		
		double radius = perimSquare / (2*3.14);
		
		System.out.print("Radius of the circle fence : " +radius );
		
		
	}
}