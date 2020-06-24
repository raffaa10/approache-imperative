package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		
		
		Scanner entree = new Scanner(System.in);
		// Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et
		// 10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de
		// multiplication de ce nombre. 
		int Nb = 0;
		boolean condArret = false;
		
		do {
			System.out.println("Entrez un nombre entre 1 et 10");
			
			Nb = entree.nextInt();
			
			if (Nb >= 1 && Nb <= 10) {
				condArret = true; 
				for(int i = 1; i <= 10; i++) {
					System.out.println(Nb + " * " + i + " = " + Nb*i );
				}
			}
		}
		while (!condArret);
		// System.out.println(Nb);
		entree.close();
	}

}
