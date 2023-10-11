package Javalar;

import java.util.ArrayList;
import java.util.Random;

public class Dev extends Externos {

	public void colisãodev(Planeta planeta2) {

		if (posiçãox == planeta2.posiçãox && posiçãoy == planeta2.posiçãoy && planeta2.vivo == true
				&& existir == true) {
			System.out.println(planeta2.nome + " se encontrou com um Dev!");
			planeta2.velocidade++;
			planeta2.numerodevs++;
			existir = false;
		}
	}

	public ArrayList<Dev> criardevs(int i) {
		int k;
		int j;
		ArrayList<Dev> devs = new ArrayList<>();
		for (k = 0; k < i; k++) {
			Dev dev = new Dev();
			dev.gerarPosição();
			do {
				j = 1;
				for (Dev dev1 : devs) {
					if (dev.posiçãox == dev1.posiçãox && dev.posiçãoy == dev1.posiçãoy) {
						dev.gerarPosição();
						j = 0;
					}
				}
			} while (j == 0);

			devs.add(dev);
		}

		return devs;
	}

	public ArrayList<Dev> conferirposiçãodevcombug(ArrayList<Bug> bug, ArrayList<Dev> dev) {

		int i;
		do {
			i = 1;
			for (Dev dev2 : dev) {
				for (Bug bug1 : bug) {
					if ((dev2.posiçãox == bug1.posiçãox && dev2.posiçãoy == bug1.posiçãoy)
							|| (posiçãox == 8 && posiçãoy == 8)) {
						dev2.gerarPosição();
						i = 0;
					}
				}
			}
		} while (i == 0);

		return dev;
	}

	public ArrayList<Dev> retirardevsscolididos(ArrayList<Dev> devs) {

		for (int i = 0; i < devs.size(); i++) {
			if (devs.get(i).existir == false) {
				devs.remove(devs.get(i));
			}
		}
		return devs;
	}

	public void printposiçãodevs(ArrayList<Dev> devs) {
		for (Dev dev : devs) {
			System.out.println(" (" + dev.posiçãox + "," + dev.posiçãoy + ") ");
		}
	}

}