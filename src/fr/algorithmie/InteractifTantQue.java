package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		/** Ecrire un programme qui demande un nombre à l’utilisateur qui doit être obligatoirement
		compris entre 1 et 10 :
		- Tant que ce nombre n’est pas compris entre 1 et 10, le programme redemande un
		nombre à l’utilisateur.
		- Si le nombre est compris entre 1 et 10, le programme affiche ce nombre et se termine.
		
		Instruction pour poser une question à l’utilisateur :
		Nous allons utiliser la classe java.util.Scanner.
		Scanner scanner = new Scanner(System.in) ;
		int nb = scanner.nextInt() ; **/
		Scanner entree = new Scanner(System.in);
		
		boolean conditionArret = false;
		int Nb =0;
		do {
			System.out.println("Entrez un nombre entre 1 est 10");
			
			Nb = entree.nextInt();
			if (Nb >= 1 && Nb <= 10) {
				conditionArret = true;
			} 
		}
		
		while (!conditionArret);
		System.out.println(Nb);
		entree.close();
					
	}

}
