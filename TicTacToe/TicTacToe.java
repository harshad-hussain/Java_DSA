package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

    private Player player1;
    private Player player2;
    private Board board;
    int numPlayers;

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }

    public void startGame(){
        //take player input
        Scanner s = new Scanner(System.in);
        player1 = takPlayerInput(++numPlayers); 
        player2 = takPlayerInput(++numPlayers);
          while(player1.getSymbol() == player2.getSymbol()){
            System.out.println("Enter the symbol again , Symbol is already taken :");
            player2.setSymbol(s.next().charAt(0));
          }                       
        //create the board
        board = new Board(player1.getSymbol(),player2.getSymbol());
        // play the game
         int status = Board.INCOMPLETE ;
        boolean player1Turn = true;
       
        while(status == Board.INCOMPLETE || status == Board.INVALIDMOVE){
            if(player1Turn){
                System.out.println("Player - 1 turn "+ player1.getName() + "`s turn");
                System.out.println("Enter x :");
                int x = s.nextInt();
                System.out.println("Enter Y :");
                int y = s.nextInt();

                  status =  board.Move(player1.getSymbol(),x,y);
               if(status == Board.INVALIDMOVE){
                System.out.println("Invalid move ! please try again !");
                continue;
               }

            }else{
                System.out.println("Player - 2 turn "+ player2.getName() + "`s turn");
                System.out.println("Enter x :");
                int x = s.nextInt();
                System.out.println("Enter Y :");
                int y = s.nextInt();

             status = board.Move(player2.getSymbol(), x, y);

             if(status == Board.INVALIDMOVE){
                System.out.println("Inavlid move ! please try again");
                continue;
             }
            }

            player1Turn = !player1Turn;
                board.print();

        }

        if(status == Board.PLAYER1WINS){
            System.out.println("Player 1 wins " + player1.getName() + "Wins !");
        }else if(status == Board.PLAYER2WINS){
            System.out.println("Player 1 wins " + player2.getName() + "Wins !");
        }
        else{
            System.out.println("The match is draw");
        }
    }

  


    public Player takPlayerInput(int num){
        Scanner s = new Scanner(System.in);
    System.out.println("Enter Player " + num + "name :");
    String name = s.nextLine();
    System.out.println("Enter Player " + num + " Symbol ");
    char symbol = s.next().charAt(0);
        Player p = new Player(name, symbol);
         return p;

    }
  
}
