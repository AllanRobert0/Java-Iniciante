public class ex10{
	public static void main(String args[]){
	
		int vetor[] = new int [10],i,aux=0;
	
		for(i=0;i<10;i++){
			
			vetor[i] = Input.readInt("	Digite um numero: ");
			
		}
		for(i=0;i<5;i++){
			
			aux = vetor[i];
			vetor[i] = vetor[9-i];
			vetor[9-i] = aux;
			
			System.out.println("           Vetor Inverso: "+vetor[i]);
			
		}
		for(i=5;i<10;i++){
													  		
			System.out.println("           Vetor Inverso: "+vetor[i]);
			
		}
		
			System.out.println("\n	Fim do Programa.");
		
	}

}