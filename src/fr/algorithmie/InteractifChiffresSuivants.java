package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// Ecrire un programme qui demande un nombre à l’utilisateur puis qui affiche les 10 nombres
		// suivants. Par exemple si l’utilisateur saisit 5, le programme affiche : 6, 7, 8, 9, 10, 11, 12, 13,
		// 14, 15.
		Scanner entree = new Scanner(System.in);
		
		int Nb = 0;
		
		System.out.println("Entrez un nombre");
		Nb = entree.nextInt();
		System.out.println("Les 10 nombres suivant : ");
		for (int i = 1; i < 11; i++) {
			System.out.print(Nb + i + " ");
		}
		

	}

}
