public class ex4{
	public static void main (String args[]){
	
		double tempo,velocidade;
		
		tempo = Input.readDouble("	Digite o tempo: ");
		velocidade = Input.readDouble("	Digite a velocidade media: ");
	
	
	
		System.out.println("\n Velocidade Media: "+(velocidade));
		System.out.println("\n Tempo Gasto: "+tempo);
		System.out.println("\n Distancia Percorrida: "+(tempo*velocidade));
		System.out.println("\n Litros Gastos: "+(tempo*velocidade)/12);
	
	}
}