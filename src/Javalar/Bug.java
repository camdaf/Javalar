package Javalar;

import java.util.ArrayList;
import java.util.Random;

public class Bug extends Externos {

	public void colisãobug(Planeta planeta) {

		if (posiçãox == planeta.posiçãox && posiçãoy == planeta.posiçãoy && planeta.vivo == true && existir == true) {
			System.out.println(planeta.nome + " se encontrou com um Bug!");
			planeta.velocidade--;
			planeta.numerobugs++;
			existir = false;
			if (planeta.velocidade == 0) {
				planeta.vivo = false;
			}
		}

	}

	public ArrayList<Bug> criarbugs(int i, ArrayList<Dev> dev) {
		int k;
		int j;
		ArrayList<Bug> bugs = new ArrayList<>();
		for (k = 0; k < i; k++) {
			Bug bug = new Bug();
			bug.gerarPosição();
			bug.conferirposiçãobugcomdev(dev);

			do {
				j = 1;
				for (Bug bug2 : bugs) {
					if (bug.posiçãox == bug2.posiçãox && bug.posiçãoy == bug2.posiçãoy) {
						bug.gerarPosição();
						bug.conferirposiçãobugcomdev(dev);
						j = 0;
					}
				}
			} while (j == 0);

			bugs.add(bug);

		}
		return bugs;
	}

	public void conferirposiçãobugcomdev(ArrayList<Dev> dev) {
		int i;
		do {
			i = 1;

			for (Dev dev2 : dev) {
				if ((posiçãox == dev2.posiçãox && posiçãoy == dev2.posiçãoy) || (posiçãox == 8 && posiçãoy == 8)) {
					gerarPosição();
					i = 0;
				}
			}

		} while (i == 0);

	}

	public ArrayList<Bug> retirarbugscolididos(ArrayList<Bug> bugs) {
		for (int i = 0; i < bugs.size(); i++) {
			if (bugs.get(i).existir == false) {
				bugs.remove(bugs.get(i));
			}
		}
		return bugs;
	}

	public void printposiçãobugs(ArrayList<Bug> bugs) {
		for (Bug bug : bugs) {
			System.out.println(" (" + bug.posiçãox + "," + bug.posiçãoy + ") ");
		}
	}

}
