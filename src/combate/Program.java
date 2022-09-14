package combate;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro Campeão:");

		System.out.print("Nome: ");
		String nome1 = sc.next();

		System.out.print("Vida Inicial: ");
		int vida1 = sc.nextInt();

		System.out.print("Ataque: ");
		int ataque1 = sc.nextInt();

		System.out.print("Armadura: ");
		int armadura1 = sc.nextInt();

		Champion champion1 = new Champion(nome1, vida1, ataque1, armadura1);

		System.out.println();

		System.out.println("Digite os dados do segundo Campeão:");

		System.out.print("Nome: ");
		String nome2 = sc.next();

		System.out.print("Vida Inicial: ");
		int vida2 = sc.nextInt();

		System.out.print("Ataque: ");
		int ataque2 = sc.nextInt();

		System.out.print("Armadura: ");
		int armadura2 = sc.nextInt();

		Champion champion2 = new Champion(nome2, vida2, ataque2, armadura2);

		System.out.println("Quantos turnos você deseja executar? ");
		int turnos = sc.nextInt();

		for (int i = 0; i < turnos; i++) {

			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);

			System.out.printf("Resultado do turno %d:", (i + 1));
			System.out.println();
			champion1.status();
			champion2.status();

			System.out.println();

			if (champion1.life < 1 || champion2.life < 1) {
				break;
			}

		}

		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
