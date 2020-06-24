package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		

		// D�clarez un tableau d�entiers contenant tous les entiers de 1 � 10
		
		int[] entiers = new int[10];
		
		for (int i = 0; i < 10; i++) {
			entiers[i] = i + 1;
			System.out.println(entiers[i]);
	
		}
		
		System.out.println("____________________________________");
		// Affichez le premier �l�ment du tableau
		
		System.out.println(entiers[0]);
		
		System.out.println("____________________________________");
		// Affichez la longueur du tableau en utilisant la propri�t� length
		
		System.out.println(entiers.length);
		
		System.out.println("____________________________________");
		// Affichez le dernier �l�ment du tableau en utilisant la propri�t� length
		
		System.out.println(entiers[entiers.length-1]);
		
		System.out.println("____________________________________");
		// Modifiez la valeur de l��l�ment d�index 4 et donnez lui la valeur 8.
		
		entiers[4] = 8;

		//Une boucle suppl�mentaire pour v�rifier la modification de la valeur
		for (int i = 0; i < 10; i++) {
			System.out.println(entiers[i]);
		
		}
		
		
	}

}
