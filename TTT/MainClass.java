package TTT;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	Players p1 = new Players("p1", '0');
	Players p2 = new Players("p2", '1');
	
	Game game = new Game(3, new Players[]{p1, p2}, p1);
	
	Scanner sc = new Scanner(System.in);
	int f=1;
	
	while(game.status == Status.In_Progress) {
		
		if(f==1)
		game.printGame();
		
		System.out.println("Player " + game.currentPlayer.name + " " + "Enter x and y ");
		
		System.out.println("Enter x : ");
		int x = sc.nextInt();
	
        System.out.println("Enter y : ");
		int y = sc.nextInt();
		
		boolean isPos = game.makeMove(x,y,game.currentPlayer);
		
		if(isPos) {
			
			if(game.checkWinner(x,y)) {
				System.out.println("Winner is : " + game.currentPlayer.name);
				return;
				
			}else if(game.checkDraw(x,y)){
				System.out.println("Game Draw");
				return ;
			}else {
				game.currentPlayer = game.currentPlayer.symbol=='0'?p2:p1;
		    }
			f=1;
		}else {
			f=0;
			System.out.println("Entered Position is not Available");
			continue;
		}
	   }
	
	    return ; 
	 
	}
}
