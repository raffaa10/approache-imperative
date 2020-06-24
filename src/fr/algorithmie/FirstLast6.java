package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// Dans cette classe, on déclare un tableau d’entiers
		int[] array = {1, 2, 5, 6} ;
		
		// On calcule une valeur booléenne qui contrôle le tableau de la sorte :
		boolean booleene = true;
		// elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le
		// dernier élément vaut 6.
		
		if (array.length >= 1 && (array[0] == 6 || array[array.length-1] == 6)) {
			booleene = true;
		}
			
		// elle vaut false dans les autres cas
		else {
			booleene = false;
		}
		// écrire l’algo de valorisation de cette variable avec le minimum de ligne
		System.out.println(booleene);
		
		

	}

}
