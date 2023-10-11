package Javalar;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	int i = 1;
	int k = 0;
	int qntinstante;
	int qntdev;
	int qntbug;
	int opção;
	int instantes = 0;
	Relatorio relatorio = new Relatorio();
	Scanner input = new Scanner(System.in);
	Distancia distancia = new Distancia();
	Planeta planeta = new Planeta();
	Bug bug = new Bug();
	Dev dev = new Dev();
	ArrayList<Planeta> p = planeta.planetas();
	ArrayList<Dev> desenvolvedoresgerais = dev.criardevs(0);
	ArrayList<Bug> bugsgerais = bug.criarbugs(0, desenvolvedoresgerais);
	
	public Sistema(){
		menu();
	}
	
	public void menu(){

		do {

			perguntasAoUsuario();
			instantes += qntinstante;

			ArrayList<Dev> desenvolvedoresparciais = dev.criardevs(qntdev);
			ArrayList<Bug> bugsparciais = bug.criarbugs(qntbug, desenvolvedoresparciais);

			moverPosiçãoAteOInstanteFinal(p);
			declaraçãoFinalBugs(desenvolvedoresparciais, bugsparciais);
			printPosiçãoPlanetas();
			verificarColisãoBugs(bugsgerais);
			verificarColisãoDevs(desenvolvedoresgerais);
			
			distancia.distancia(p);
			distancia.norteesul(p);
			
			posiçãoBugsParciais(bugsparciais);
			posiçãoBugsGerais();
			posiçãoDesenvolvedoresParciais(desenvolvedoresparciais);
			posiçãoDesenvolvedoresGerais();

			verificarOpção();

		} while (opção == 1);
		System.out.println("Sistema acabou!\nRelatório:");
		relatorio.printPlanetasDestruidos(p);
		relatorio.printQuantidadeBugs(p);
		relatorio.printQuantidadedeDevs(p);
		instantesSolicitados();
		relatorio.descriçãoPlanetas();
	}

	private void posiçãoDesenvolvedoresGerais() {
		System.out.println("Posição total de todos os devs:");
		dev.printposiçãodevs(desenvolvedoresgerais);
	}

	private void posiçãoDesenvolvedoresParciais(ArrayList<Dev> desenvolvedoresparciais) {
		System.out.println("Posição de devs colocados nesse instante:");
		dev.printposiçãodevs(desenvolvedoresparciais);
	}

	private void posiçãoBugsGerais() {
		System.out.println("Posição total de todos os bugs:");
		bug.printposiçãobugs(bugsgerais);
	}

	private void posiçãoBugsParciais(ArrayList<Bug> bugsparciais) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Posição dos bugs colocados durante esse periodo de instante :");
		bug.printposiçãobugs(bugsparciais);
	}

	private void instantesSolicitados() {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");
		System.out.println("Quantidade de instantes solicitadados: " + instantes);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");
	}

	private void verificarOpção() {

		do {
			System.out.println(
					"-----------------------------------------------------------------------------------------------------------------------");
			System.out.println("[1] - CONTINUAR\n[2] - SAIR");
			opção = input.nextInt();
			if (opção != 1 && opção != 2) {
				System.out.println("Opção invalida");
			}

		} while (opção != 1 && opção != 2);
	}

	private void declaraçãoFinalBugs(ArrayList<Dev> d2, ArrayList<Bug> b2) {
		for (Bug bug : b2) {
			bugsgerais.add(bug);
		}
		bug.retirarbugscolididos(bugsgerais);

		for (Dev dev : d2) {
			desenvolvedoresgerais.add(dev);
		}
		dev.retirardevsscolididos(desenvolvedoresgerais);
	}

	private void verificarColisãoDevs(ArrayList<Dev> d) {
		for (Planeta planeta2 : p) {
			for (Dev dev1 : d) {
				dev1.colisãodev(planeta2);
			}

		}
	}

	private void verificarColisãoBugs(ArrayList<Bug> b) {

		for (Planeta planeta2 : p) {
			for (Bug bug1 : b) {
				bug1.colisãobug(planeta2);

			}
		}
	}

	private void printPosiçãoPlanetas() {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------");
		for (Planeta planeta2 : p) {
			System.out.println(planeta2.nome + " " + "(" + planeta2.posiçãox + "," + planeta2.posiçãoy + ")");
			if (planeta2.vivo == false) {
				System.out.println(planeta2.nome + "explodiu!");
			}
		}
		System.out.println("\n");
	}

	private void moverPosiçãoAteOInstanteFinal(ArrayList<Planeta> p) {

		do {
			i = 1;
			for (Planeta planeta2 : p) {
				planeta2.moverPosição(i);

				i++;

			}
			k++;
		} while (k < qntinstante);
	}

	private void perguntasAoUsuario() {
		System.out.println("Digite a quantidade de instantes");
		qntinstante = input.nextInt();

		System.out.println("Digite a quantidade de bugs");
		qntbug = input.nextInt();

		System.out.println("Digite a quantidade de devs");
		qntdev = input.nextInt();
	}
}
