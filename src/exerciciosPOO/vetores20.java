package exerciciosPOO;

import java.util.Random;

public class vetores20 {

	public static void main(String[] args) {
	int[] vet = new int[20];
	Random r = new Random();
	int tot = 0,soma = 0;

		for (int i = 0; i < vet.length; i++) {
			vet[i] = r.nextInt(20);
			System.out.print("| " + vet[i] + " |");
		}
		
		System.out.println(" ");
		System.out.println("Os valores pares são: ");
		for (int i = 0; i < vet.length; i++) {

			if (vet[i] % 2 == 0) {
				
				System.out.print("| " + vet[i] + " |");
				
			}
		}
	}
}
