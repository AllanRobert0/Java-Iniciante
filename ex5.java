public class ex5{
	public static void main(String args[]){
	
		int tempo;
		double valor,taxa;
	
		tempo = Input.readInt("	Digite Tempo (dias) :");
		valor = Input.readDouble("	Digite Valor :");
		taxa  = Input.readDouble("	Digite Taxa :");
		
		System.out.println("\n 	Valor da prestacao: "+(valor*(taxa/100)*tempo));
	
	}
}