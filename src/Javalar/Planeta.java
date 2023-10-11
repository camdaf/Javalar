package Javalar;

import java.util.ArrayList;
import java.util.List;

public class Planeta {
	protected String nome;
	protected String descrição;
	protected int posiçãox;
	protected int posiçãoy;
	protected int velocidade;
	protected boolean vivo = true;
	protected double ano = 0.0;
	protected double rotação = 0.0;
	protected int controtação;
	protected double periodo;
	protected int numerobugs;
	protected int numerodevs;

	public ArrayList<Planeta> planetas() {
		ArrayList<Planeta> p = new ArrayList<>();
		p.add(new Python("Python", 4, 8, 9));
		p.add(new Javascript("Javascript", 3, 8, 10));
		p.add(new RubyonRails("RubyonRails", 2, 8, 11));
		p.add(new Php("PHP", 2, 8, 12));
		p.add(new Csharp("C#", 1, 8, 13));
		p.add(new Cplusplus("C++", 2, 8, 14));
		p.add(new C("C", 10, 8, 15));

		return p;
	}

	public Planeta() {

	}

	public Planeta(String nome, int velocidade, int posiçãox, int posiçãoy,int periodo) {
		super();
		this.nome = nome;
		this.posiçãox = posiçãox;
		this.posiçãoy = posiçãoy;
		this.velocidade = velocidade;
		this.periodo = periodo;
	}

	public void moverPosição(int distancia) {
		int cont = 0;
		do {
			if (posiçãoy == 8 + distancia && posiçãox != 8 - distancia) {
				posiçãox--;
			}

			else if (posiçãoy == 8 - distancia && posiçãox != 8 + distancia) {
				posiçãox++;
			}

			else if (posiçãox == 8 + distancia && posiçãoy != 8 + distancia) {
				posiçãoy++;
			}

			else if (posiçãox == 8 - distancia && posiçãoy != 8 - distancia) {
				posiçãoy--;
			}
			if (posiçãox == 8 && posiçãoy == 8 + distancia) {
				ano++;
			}

			cont++;
		} while (cont < this.velocidade);

	}

	public double contRotação(double periodo) {
		rotação = rotação + periodo / 24;
		return rotação;
	}

}
