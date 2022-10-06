import java.util.*;

public class Lanceur {
	
	public static void main(String[] args) {
		System.out.println("Démineur");
		
		int[][] twoD_arr = new int[5][7];
		boolean[][] mines = new boolean[5][7];
		
		twoD_arr[1][1] = 10;
		twoD_arr[3][5] = 99;
		
		System.out.println(Arrays.deepToString(twoD_arr));
		
		Plateau plat1 = new Plateau(5,7,10);
		plat1.ajouteMinesAlea();
		plat1.calculeAdjacence();
		//System.out.println((Arrays.deepToString(plat1.mines)));
		//System.out.println((Arrays.deepToString(plat1.adja)));
		
		for (int i = 0; i < plat1.mines.length; i++) {
		    for (int j = 0; j < plat1.mines[i].length; j++) {
		        System.out.print(plat1.mines[i][j] + " ");
		    }
		    System.out.println();
		}
		
		for (int i = 0; i < plat1.adja.length; i++) {
		    for (int j = 0; j < plat1.adja[i].length; j++) {
		        System.out.print(plat1.adja[i][j] + " ");
		    }
		    System.out.println();
		}
		
		
		
		
	}

}
