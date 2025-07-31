package TTT;

public class Game {

	Board board;
	Players[] players = new Players[2];
	Status status;
	Players currentPlayer;
	
	public Game(int size, Players[] players, Players p) {
		this.board = new Board(size);
		this.players[0] = players[0];
		this.players[1] = players[1];
		this.status = status.In_Progress;
		this.currentPlayer = p;
	}

	public void printGame() {
		board.printBoard();
	}

	public boolean makeMove(int x, int y, Players currentPlayer) {
		
		if(board.cells[x][y].symbol == '_') {
		    board.cells[x][y].symbol = currentPlayer.symbol;
		    return true;
		}else
			return false;

	}

	public boolean checkWinner(int x, int y) {
		int f=0;
		if(true) {
			for(int i=0;i<2;i++) {
				if(board.cells[i][y].symbol!=board.cells[i+1][y].symbol) {
					f=1;			
			    }
			}
			if(f==0)
		    return true;
		}
		
		if (true) {
			
			for(int i=0;i<2;i++) {
				if(board.cells[x][i].symbol!=board.cells[x][i+1].symbol) {
					f=1;
				}
			}
			if(f==0)
			return true;
		}
		
		if(x==y) {
			if(((board.cells[0][0].symbol!='_') && (board.cells[0][0].symbol == board.cells[1][1].symbol) && (board.cells[0][0].symbol == board.cells[2][2].symbol)) || 
					((board.cells[2][0].symbol!='_') && (board.cells[2][0].symbol == board.cells[1][1].symbol) && (board.cells[2][0].symbol == board.cells[0][2].symbol))) {
				return true;
			}
		}
		
		return false;
	}

	
	public boolean checkDraw(int x, int y) {
	     for(int i=0;i<3;i++) {
	    	 for(int j=0;j<3;j++) {
	    		 if(board.cells[i][j].symbol=='_')
	    			 return false;
	    	 }
	     }
		 return true;
	}

}
