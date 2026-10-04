public class IT26102533Lab2Q3{
	
	public static void main(String[] args){
		
		double sideA = 3;
		double sideB = 4;
		
		// Hypotenuse = squareroot(sideA^2 + sideB^2) - Pythegerous theorem
		
		double Hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);
		
		System.out.print("Hypotenuse of the Right triangle : " +Hypotenuse);
		
	}
}