
public class MathtestDriver {
	public static void main(String[] args) {
		MathSingleton m1 = MathSingleton.getInstance();
		m1.setVariable1(5);
		m1.setVariable2(5);
		System.out.println("add "+m1.add());
		System.out.println("divide "+m1.divide());
		System.out.println("multiply "+m1.multiply());
//		
		
	}
}
