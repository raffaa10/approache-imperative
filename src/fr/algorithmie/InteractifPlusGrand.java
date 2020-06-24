package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
		// ces nombres. 
		Scanner entree = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.println("Entrez 10 nombres");
		for (int i = 0; i < 10; i++) {
			// System.out.println("Entrez nombre numero " + (i + 1));
			array[i] = entree.nextInt();
		}
		int maxValue = array[0];
		for (int i = 0; i < 10; i++) {
			if (maxValue < array[i]) {
				maxValue = array[i];
			}
	
		}
		System.out.println("La plus grande value egal a " + maxValue);
	}

}
