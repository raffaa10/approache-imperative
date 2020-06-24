package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		
		Scanner entree = new Scanner(System.in);
		// La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de
		// rang N est égal à la somme des nombres de rangs N-1 et N-2
		
		// Demander à l’utilisateur de choisir un rang N
		// Ecrire un algorithme qui calcule et affiche le nombre de rang N 
		int Nb = 0;
		
		System.out.println("Entrez un nombre positif");
		
		Nb = entree.nextInt();
		
		int fibArray[] = new int[Nb];
		
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		for (int i = 2; i <= Nb - 1; i++) {
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
		}
		System.out.println("Le rang " + Nb + " dans la suite de Fibonacci egal a " + fibArray[Nb-1]);
		
		entree.close();
		
	}

}
