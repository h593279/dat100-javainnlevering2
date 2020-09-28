package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	private static final Object[] String = null;

	// a)
	public static void skrivUt(int[] tabell) {
		
		System.out.print("a) Skriv ut: [");
		
		for (int i = 0; i<tabell.length; i++) {
			
		System.out.print(tabell[i] + " "); }
			 
		System.out.println("]");
		
		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		
		String[] obs = {"[42, 67, 89]"};
		
		for (int i = 0; i < obs.length; i++) {
				
		 System.out.println("   b) til streng: " + obs[i]);
		}

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");	
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum1= 0;
		for(int i = 0; i < tabell.length; i++) {
			sum1 += tabell[i];
			
		}
			System.out.println("c) for-løkke: " + sum1);
		
		int sum2= 0;
		int a= 0;
		
		while(a < tabell.length) {
		
			sum2 =tabell[a] + sum2;
			a++;
		
		}
		System.out.println("c) while-løkke: " + sum2);
		
		
		int sum3 = 0;
		
		for ( int b : tabell) {
			
		      sum3 += b;
		
		}
		System.out.println("c) utvidet for-løkke:" + sum3);
		

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean funnet = false;
		int c = 0;
		int sum4 = 0;
		  
		  while ((c<tabell.length) && (!funnet)) {
		
			  if (tabell[c] > sum4) { funnet = true;
		} c++;
		}
		 System.out.println("d) finnes tall: " + funnet);
		

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int tall1 = -1;
		
		for (int i = 0; i < tabell.length; i++) {
			
			if(tabell [i] == tall); {
			
			}
				return (tall1);
			
		}
		

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		System.out.print("f) Revers: [");
		
		for(int i= tabell.length-1;i>=0; i--) {
			
	         System.out.print(tabell[i] + "  ");
	         
		}
		System.out.print("]");
		
		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean funnet = false;
		
		  int i = 0;
		  while ((i < tabell.length) || (!funnet)) {
			  if (tabell[i] > tabell.length) { funnet = true;
		} i++;
		}
		  System.out.println ("g) " + funnet);
		

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
	
		System.out.print(" h) ");
		
		int flength = tabell1.length;
		int alength = tabell2.length;
		
		int[] settSammen = new int[flength + alength ];
		int telle = 0;
		
		for(int i = 0; i < flength; i++) {
			settSammen[i] = tabell1[i];
			telle++;
		}
		
		for(int y = 0; y < alength; y++) {
			settSammen[telle++] = tabell2[y];
		}
		for(int i = 0; i < settSammen.length; i++) 
			System.out.print(settSammen[i] + " ");
		
		

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
