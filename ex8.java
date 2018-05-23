public class ex8{
	public static void main(String args[]){
		
		int numero1 = 0,numero2 = 0,opcao = 0;
		boolean chave = true;
		double res;
		
		while(chave == true){ 			
			opcao = Input.readInt("	\n Digite a opcao: ");			
			switch(opcao){
				
				case 1:
				numero1 = Input.readInt("	Digite primeiro numero: ");
				numero2 = Input.readInt("	Digite segundo numero: ");
				break;
				
				case 2:
				res = numero1 + numero2;
				System.out.println("	Resposta: "+res);
				break;
				
				case 3:
				res = numero1 - numero2;
				System.out.println("	Resposta: "+res);
				break;
				
				case 4:
				res = numero1 * numero2;
				System.out.println("	Resposta: "+res);
				break;
				
				case 5:
				res = (numero1/numero2);
				System.out.println("	Resposta: "+res);
				break;
				
				case 6:
				chave = false;
				System.out.println("\n	Fim do Programa!");
				break;
				
				default:
				System.out.println("\n	Opcao Invalida.@ Tente novamente.");
				break;
			}
		}		
	}
}