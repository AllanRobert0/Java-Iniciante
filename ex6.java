public class ex6{
	public static void main(String args[]){
	
		int base,expoente,i,res;
		
		base = Input.readInt("	Digite a Base: ");
		expoente = Input.readInt("	Digite o expoente: ");
		
		res = 1;
		
		for(i=0;i<expoente;i++){
			
			res = res * base; 
			
		}
	
		
		System.out.println(" \n Resultado: "+res);
	
	}
}