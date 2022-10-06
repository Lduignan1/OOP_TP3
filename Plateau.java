import java.util.*;

public class Plateau {
	
	int hauteur;
	int largeur;
	int nbMines;
	int nbDrapeaux;
	boolean[][] mines;
	private int[][] etats;
	int[][] adja;
	
	public Plateau(int ha, int la, int mi) {
		this.hauteur = ha;
		this.largeur = la;
		this.nbMines = mi;
		this.nbDrapeaux = 0;
		this.mines = new boolean[ha + 2][la + 2]; 
		this.etats = new int[ha + 2][la + 2]; 
		this.adja = new int[ha + 2][la + 2]; 
		
	}
	
	void ajouteMinesAlea() {
		Random rd = new Random();
		
		int i = 0;
		while (i < nbMines) {
			
			int rdHa = rd.nextInt(1, hauteur+1);
			int rdLa = rd.nextInt(1, largeur+1);
			
			if (!mines[rdHa][rdLa]) {
				mines[rdHa][rdLa] = true;
				i++;
			}
		}
	}
	
	void calculeAdjacence() {
		for (int i = 1, j = 1; i < hauteur+1 && j < largeur+1; i++, j++ ) {
			int countMines = 0;
			if (mines[i-1][j-1]) {
				countMines++;
			}
			if (mines[i-1][j]) {
				countMines++;
			}
			if (mines[i-1][j+1]) {
				countMines++;
			}
			if (mines[i][j-1]) {
				countMines++;
			}
			if (mines[i][j+1]) {
				countMines++;
			}
			if (mines[i+1][j-1]) {
				countMines++;
			}
			if (mines[i+1][j]) {
				countMines++;
			}
			if (mines[i+1][j+1]) {
				countMines++;
			}
			
			adja[i][j] = countMines;
		}
		
		
	}
}

