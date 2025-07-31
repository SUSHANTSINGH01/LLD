package TTT;

public class Board {

	Cell[][] cells;
	
	public Board(int size) {
		cells = new Cell[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				this.cells[i][j] = new Cell(i,j,'_');
			}
		}
		
	}

	public void printBoard() {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			    System.out.print(cells[i][j].symbol + " ");
			}
			System.out.println();
		}
	}
	
}
