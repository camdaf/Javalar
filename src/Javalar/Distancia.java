package Javalar;
import java.util.ArrayList;
public class Distancia {
	
	public void distancia(ArrayList<Planeta> planetas) {
		int i = 0;
		int k;
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Distancias :");
		for (Planeta planeta : planetas) {
			k = 0;
			for (Planeta planeta2 : planetas) {
				if(i > k) {
					int n = planeta.posiçãox - planeta2.posiçãox + 1;
					int m = planeta.posiçãoy - planeta2.posiçãoy + 1;
				
				
					if(n < 0) {
					n = -n;
					}
					if(m < 0) {
					m = -m;
					}
					System.out.println("-----------------------------------------------------------------------------------------------------------------------");
					System.out.println("A distância de área entre " + planeta.nome + " e " + planeta2.nome + " é " + (int)((n) * (m)) );
					System.out.println("A distância euclidiana entre " + planeta.nome + " e " + planeta2.nome + " é " + (Math.sqrt(Math.pow(n,2) + Math.pow(m, 2)) ));
					
				}
					k++;
			}
		
		i++;
		}
		
	}

	public void norteesul(ArrayList<Planeta> planetas) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		for (Planeta planeta : planetas) {
			if(planeta.posiçãoy > 8) {
				System.out.println(planeta.nome + " está no norte ");
			}
			else {
				System.out.println(planeta.nome + " está no sul ");
			}
		}
	}











}




	

