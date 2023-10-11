package Javalar;

import java.util.ArrayList;

public class Relatorio {
	public void printQuantidadeBugs(ArrayList<Planeta> planetas ) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		for (Planeta planeta : planetas) {
			System.out.println(planeta.nome + " colidiu com " + planeta.numerobugs + " bugs");
		}
		
	}
	public void printQuantidadedeDevs(ArrayList<Planeta> planetas ) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		for (Planeta planeta : planetas) {
			System.out.println(planeta.nome + " colidiu com " + planeta.numerodevs + " devs");
		}
	}
	public void printPlanetasDestruidos(ArrayList<Planeta> planetas) {
		System.out.println("-----------------------------------------------------------------------------------------------------------------------");
		for (Planeta planeta : planetas) {
			if(planeta.vivo == false) {
				System.out.println(planeta.nome + " explodiu durante a execução do javalar ");
			}
		}
		
	}
	public void descriçãoPlanetas() {
		System.out.println("\nPython:\r\n"
				+ "\r\n"
				+ "Python é conhecida por sua sintaxe clara e legível, tornando-a fácil de aprender e usar.\r\n"
				+ "É uma linguagem de alto nível usada em várias aplicações, incluindo desenvolvimento web, automação, ciência de dados e IA.\r\n"
				+ "Possui uma ampla comunidade de desenvolvedores e uma vasta biblioteca padrão.\r\n"
				+ "\nJavaScript:\r\n"
				+ "\r\n"
				+ "JavaScript é uma linguagem de programação para desenvolvimento web, permitindo a criação de interatividade em páginas da web.\r\n"
				+ "É executada no navegador do cliente e é essencial para a criação de sites dinâmicos e aplicativos da web.\r\n"
				+ "Possui muitas bibliotecas e estruturas populares, como React e Angular.\r\n"
				+ "\nRuby on Rails (Ruby):\r\n"
				+ "\r\n"
				+ "Ruby é uma linguagem de programação de alto nível conhecida por sua simplicidade e produtividade.\r\n"
				+ "Ruby on Rails é um framework web baseado em Ruby, que simplifica o desenvolvimento de aplicativos web.\r\n"
				+ "É frequentemente usado para desenvolvimento rápido de protótipos e startups.\r\n"
				+ "\nPHP:\r\n"
				+ "\r\n"
				+ "PHP é uma linguagem de programação de servidor amplamente utilizada para desenvolvimento web.\r\n"
				+ "É eficaz para criar sites dinâmicos e se integra facilmente a bancos de dados, como o MySQL.\r\n"
				+ "Muitos sistemas de gerenciamento de conteúdo, como o WordPress, são construídos com PHP.\r\n"
				+ "\nC++:\r\n"
				+ "\r\n"
				+ "C++ é uma linguagem de programação de médio a alto nível conhecida por seu desempenho e uso em desenvolvimento de sistemas, jogos e aplicativos de desktop.\r\n"
				+ "É uma extensão da linguagem C, com recursos de programação orientada a objetos.\r\n"
				+ "É usado em aplicações de alto desempenho e sistemas críticos.\r\n"
				+ "\nC# (C Sharp):\r\n"
				+ "\r\n"
				+ "C# é uma linguagem de programação desenvolvida pela Microsoft, voltada principalmente para o desenvolvimento de aplicativos Windows e jogos com a Unity.\r\n"
				+ "É uma linguagem orientada a objetos e suporta programação multiplataforma com o .NET Core.\r\n"
				+ "Tem uma forte ênfase em segurança e é amplamente usada em ambientes empresariais.\r\n"
				+ "\nC:\r\n"
				+ "\r\n"
				+ "C é uma linguagem de programação de baixo nível, amplamente utilizada para desenvolver sistemas operacionais, drivers de hardware e aplicativos incorporados.\r\n"
				+ "É conhecida por sua eficiência e controle sobre o hardware do computador.\r\n"
				+ "Outras linguagens, como C++ e C#, foram derivadas de C.");
	}

	




}
