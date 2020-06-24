package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
		// entiers compris entre 1 et ce nombre.
		// Exemple si l’utilisateur saisit 5, le programme affiche: 15
		Scanner entree = new Scanner(System.in);
		
		int Nb = 0;
		int somme = 0;
		
		System.out.println("Entrez un nombre ");
		Nb = entree.nextInt();
		System.out.println("La somme de tout les nombres compris entre 1 et " + Nb);
		for(int i = Nb; i > 0; i--) {
			somme = somme + i;
		}
		System.out.println(somme);
	}

}
