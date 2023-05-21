import java.util.*;

public class TicTacToe {
	
	public class JavaApplication14 {
	    static String[] board; //array
	    static String turn; //variable
	    
	    // To print out the board.
	    /* |---|---|---|
	       | 1 | 2 | 3 |
	       |-----------|
	       | 4 | 5 | 6 |
	       |-----------|
	       | 7 | 8 | 9 |
	       |___|___|___|*/
	    
	    static void design()
	    {
	        System.out.println("|---|---|---|");
	        System.out.println("| " + board[0] + " | "
	                           + board[1] + " | " + board[2]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[3] + " | "
	                           + board[4] + " | " + board[5]
	                           + " |");
	        System.out.println("|-----------|");
	        System.out.println("| " + board[6] + " | "
	                           + board[7] + " | " + board[8]
	                           + " |");
	        System.out.println("|___|___|___|");
	    }
	  // CheckWinner method will 
	    // decide the combination 
	    // of three box given below.
	    static String pwinner()
	    {
	        for (int A = 1; A < 9; A++) {
	            String line = null;
	  
	            switch (A) {
	            case 1:
	                line = board[0] + board[1] + board[2];
	                break;
	            case 2:
	                line = board[3] + board[4] + board[5];
	                break;
	            case 3:
	                line = board[6] + board[7] + board[8];
	                break;
	            case 4:
	                line = board[0] + board[3] + board[6];
	                break;
	            case 5:
	                line = board[1] + board[4] + board[7];
	                break;
	            case 6:
	                line = board[2] + board[5] + board[8];
	                break;
	            case 7:
	                line = board[0] + board[4] + board[8];
	                break;
	            case 8:
	                line = board[2] + board[4] + board[6];
	                break;
	            }
	            //For X pwinner
	            if (line.equals("XXX")) 
	                return "X";
	            
	              
	            // For O winner
	            else if (line.equals("OOO")) 
	                return "O";
	            
	        }
	          
	        for (int a = 0 ; a < 9 ; a++) {
	            if (Arrays.asList(board).contains(
	                    String.valueOf(a + 1))) {
	                break;
	            }
	              else if (a == 8) {
	               return "draw";
	           }
	        }
	  
	       // To enter the X Or O at the exact place on board.
	        System.out.println(
	            turn + "'s turn; Enter a slot number to place "
	            + turn + " in:");
	        return null;
	    }
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        board = new String[9];
	        turn = "X";
	        String winner = null;
	  
	        for (int a = 0; a < 9; a++) {
	            board[a] = String.valueOf(a + 1);
	        }
	  
	        System.out.println("Welcome to 3x3 Tic Tac Toe.");
	        design();
	  
	        System.out.println(
	            "X will play first. Enter a slot number to place X in:");
	  
	        while (winner == null) {
	            int numInput;
	            
	           // Exception handling.
	           // numInput will take input from user like from 1 to 9.
	           // If it is not in range from 1 to 9.
	           // then it will show you an error "Invalid input."
	            try {
	                numInput = in.nextInt();
	                if (!(numInput > 0 && numInput <= 9)) {
	                    System.out.println(
	                        "Invalid input; re-enter slot number:");
	                    continue;
	                }
	            }
	            catch (InputMismatchException e) {
	                System.out.println(
	                    "Invalid input; re-enter slot number:");
	                continue;
	            }
	              
	            // This game has two player x and O.
	            // Here is the logic to decide the turn.
	         
	  //to take turns between X O
	                if (turn.equals("X")) {
	                    turn = "O";
	                }
	                else {
	                    turn = "X";
	                }
	  
	                design();
	                winner = pwinner();
	            }
	           
	            
	        
	        
	        // If no one win or lose from both player x and O.
	        // then here is the logic to print "draw".
	        if (winner.equalsIgnoreCase("draw")) {
	            System.out.println(
	                "It's a draw! Thanks for playing.");
	        }
	        
	        // For winner -to display Congratulations! message.
	        else {
	            System.out.println(
	                "Congratulations! " + winner
	                + " 's has Won! Thanks for playing this game.");
	        }
	    }
	}
	}
	  
