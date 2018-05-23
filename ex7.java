public class ex7{
	public static void main(String args[]){
		
		int vetor [] = new int [5],i,soma = 0;
		
		for(i=0;i<5;i++){
			vetor[i] = Input.readInt("	Digite um numero: ");
			soma = soma + vetor[i];
		}
		
		
		System.out.println("	Soma: "+soma  	+"\n 	Sedia: "+(soma/5) 	);
	
	}
}