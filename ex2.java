public class ex2{
	public static void main(String args[]){
		
		double F;
		
		F = Input.readDouble("	Digite temp. Fahrenheit: ");
		
	
		System.out.println("Temperatura em C : "+(F-32)*(5/9));
													   //9/5 ???
								//F = C * 1,8 + 32;
								//C = (F-32) / 1.8;
	}
}