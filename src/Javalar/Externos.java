package Javalar;

import java.util.Random;
import java.util.ArrayList;

public abstract class Externos {
	protected int posiçãox;
	protected int posiçãoy;
	protected boolean existir = true;

	Random random = new Random();

	public void gerarPosição() {

		posiçãox = random.nextInt(15) + 1;
		posiçãoy = random.nextInt(15) + 1;

	}

}