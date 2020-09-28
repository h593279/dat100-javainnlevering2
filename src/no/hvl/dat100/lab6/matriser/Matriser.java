package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
	 for (int[] i : matrise ) {
		 for (int j : i) { 
			System.out.println(j); 
		 }
	
		 }
		
	
		

		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		System.out.println("Oppgave b) ");
		
		String[][] a = { {"1,2,3"}, {"4,5,6"}, {"7,8,9"} };
	    
		for (int i = 0; i < a.length; i++)
		
		System.out.print(Arrays.toString(a[i]) + "\n");	
		
		

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		System.out.println(" ");
		System.out.println("Oppgave c)");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrise[i][j] = 3*matrise[i][j];
				
			
			}
		}
		
		for ( int[] rad : matrise) {
			System.out.println();
			for (int k : rad ) {
				System.out.print(k + " ");
			}
				
		}
			
		
		
		

		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean check = true; 
		
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < b.length; j++) {
				if (a[i][j] != b[i][j]) {  
					check = false; 
		}
		}
			}
		System.out.println("Oppgave d)");
			System.out.println(check);
			
			
		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
