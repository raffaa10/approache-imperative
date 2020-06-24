package fr.algorithmie;

public class FirsLast {

	public static void main(String[] args) {
		// Dans cette classe, on déclare un tableau d’entiers
		
		int[] array = {1, 2, 4, 5, 1} ;
		
		// On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		boolean booleene = true;
		//  elle vaut true si le tableau est de longueur supérieure ou égale à 1 et que le
		//  premier et le dernier élément du tableau ont la même valeur
		if (array.length >= 1 && array[0] == array[array.length - 1] ) {
			booleene = true;
		}
		else {
			booleene = false;
		}
		// elle vaut false dans les autres cas
		// écrire l’algo de valorisation de cette variable avec le minimum de ligne
		System.out.println(booleene);
	}

}
