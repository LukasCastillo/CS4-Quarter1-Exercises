/*
 *  Tau Lukas Castillo
 */
package exercise4;

import java.util.Scanner;

/**
 *
 * @author sethl
 */
public class RockPaperScissors{
    public static void main(String[] args){
        String input;
        Scanner scanner = new Scanner(System.in);
        int roundsToWin = 2;
        
        Move ROCK = new Move("Rock");
        Move PAPER = new Move("Paper");
        Move SCISSORS = new Move("Scissors");
        Move[] moves = new Move[] {ROCK, PAPER, SCISSORS};
        
        ROCK.setStrongAgainst(SCISSORS);
        PAPER.setStrongAgainst(ROCK);
        SCISSORS.setStrongAgainst(PAPER);
        
        OUTER:
        while (true) {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");
            System.out.print("> ");
            input = scanner.nextLine();
            System.out.println();
            
            //start game
            switch (input) {
                case "1" -> {
                    int pScore = 0;
                    int cScore = 0;
                    while(Math.max(pScore, cScore) < roundsToWin){
                        System.out.printf("This match will be first to %d wins.\n", roundsToWin);
                        System.out.println("The computer has selected its move. Select your move:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        System.out.print("> ");

                        input = scanner.nextLine();
                        Move pMove = null;
                        
                        if(input.equalsIgnoreCase(ROCK.getName())) pMove = ROCK;
                        else if(input.equalsIgnoreCase(PAPER.getName())) pMove = PAPER;
                        else if(input.equalsIgnoreCase(SCISSORS.getName())) pMove = SCISSORS;
                        
                        while(pMove == null){
                            System.out.println("Invalid Move!");
                            System.out.println("Please enter your move again.");
                            System.out.print("> ");
                            
                            input = scanner.nextLine();
                            
                            if(input.equalsIgnoreCase(ROCK.getName())) pMove = ROCK;
                            else if(input.equalsIgnoreCase(PAPER.getName())) pMove = PAPER;
                            else if(input.equalsIgnoreCase(SCISSORS.getName())) pMove = SCISSORS;
                        }
                        
                        Move cMove = moves[(int) Math.floor(Math.random() * 3)];
                        int result = Move.compareMoves(pMove, cMove);
                        System.out.println("");

                        switch (result) {
                            case 2 -> System.out.printf("Player chose %s. Computer chose %s. Round is tied\n", pMove.getName(), cMove.getName());
                            case 0 -> {
                                pScore++;
                                System.out.printf("Player chose %s. Computer chose %s. Player wins round!\n", pMove.getName(), cMove.getName());
                            }
                            case 1 -> {
                                cScore++;
                                System.out.printf("Player chose %s. Computer chose %s. Computer wins round!\n", pMove.getName(), cMove.getName());
                            }
                        }
                        
                        System.out.printf("Player: %d - Computer: %d\n\n", pScore, cScore);
                    }
                    
                    System.out.println("Game is over!!!");
                    System.out.printf("%s wins the game with a score of %d\n\n", (cScore > pScore) ? "Computer" : "Player", roundsToWin);
                }
                case "2" -> {
                    System.out.println("How many wins are needed to win the next round?");
                    System.out.print("> ");
                    input = scanner.nextLine();
                    roundsToWin = Integer.parseInt(input);
                    System.out.printf("\nWins needed changed to: %d \n\n", roundsToWin);
                }
                case "3" -> {
                    break OUTER;
                }
                default -> {
                }
            }
        }
        
        System.out.println("Thanks for playing!");
    }
}