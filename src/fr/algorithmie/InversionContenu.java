package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		
		// Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy mais
		// dans l�ordre inverse.
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i <= array.length - 1; i++) {
			int j = array.length -1 - i;
			arrayCopy[i] = array[j];
		}
			
			
				
		System.out.println("____________________________________");
		// Afficher l�ensemble des �l�ments des 2 tableaux
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]+" "+arrayCopy[i]);
		}
			

	}

}
