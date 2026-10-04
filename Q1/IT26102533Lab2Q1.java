public class IT26102533Lab2Q1{
	
	public static void main(String[] args) {
		
		double perimeter = 100;
		double length;
		double width;
		
		// Deriving length from perimeter
		// p = perimeter , l = length , w = width
		// p = 2 * (l+w)
		// p = 2 * (l+3l/4) since w = 3/4 * length
		// p = 3.5l
		// l = p/3.5
		
		length = perimeter / 3.5;
		width = 0.75 * length ;
		
		System.out.println("Length of the fence : " + length);
		System.out.print("Width of the fence : " + width);
		
	}
}