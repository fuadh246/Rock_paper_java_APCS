/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.rpsls;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FUAD HASSAN
 */

public class RPSLS {
    public static void main (String[]arge){
          String choice4;
        do{
       String [] type ={"rock", "paper", "scissors", "lizard", "Spock"}; 
        System.out.println("Select player type 1 or 2");
        Scanner s3 = new Scanner (System.in);
        String playerNum = s3.nextLine();
        
        System.out.println("Enter 1st player name");
        Scanner s10 = new Scanner (System.in);
        String player1 = s10.nextLine();
        
        System.out.println("Select 1st player symbol (rock, paper, scissors, lizard, Spock)");
        Scanner s1 = new Scanner (System.in);
        String choice1 = s1.nextLine();
        
        if(playerNum.equals("1")){
            Random r=new Random();
        int randomNumber=r.nextInt(type.length);
        System.out.println("computer picked "+type[randomNumber]);
        
        //scissors
        if(choice1.equals("scissors")){
        if(type[randomNumber].equals("scissors")){
            System.out.println("Tie game");  
            }
        else if(type[randomNumber].equals("paper")){
            System.out.println("scissors cuts paper");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(type[randomNumber].equals("rock")){
            System.out.println("Rock crushes scissors");
            System.out.println("Player 2 WIN ! ! !");
            }
        else if(type[randomNumber].equals("lizard")){
            System.out.println("Scissors decapitates lizard");
            System.out.println(player1 +" WIN ! ! !");
            }
        if(type[randomNumber].equals("spock")){
            System.out.println("Spock smashes scissors");
            System.out.println("Player 2 WIN ! ! !");
            }
        }
        
        // paper
        
        if(choice1.equals("paper")){
        if(type[randomNumber].equals("scissors")){
            System.out.println("scissors cuts paper");
            System.out.println("Player 2 WIN ! ! !");
            }
        else if(type[randomNumber].equals("paper")){
            System.out.println(" Tie game");
            }
        else if(type[randomNumber].equals("rock")){
            System.out.println("paper covers rock ");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(type[randomNumber].equals("lizard")){
            System.out.println("Lizard eats paper");
            System.out.println("Player 2 WIN ! ! !");
            }
        else if(type[randomNumber].equals("spock")){
            System.out.println("Paper disproves Spock");
            System.out.println(player1 +" WIN ! ! !");
            }
        }
        
        //rock
        if(choice1.equals("rock")){
        if(type[randomNumber].equals("scissors")){
            System.out.println("rock crushes scissors");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(type[randomNumber].equals("paper")){
            System.out.println("paper covers rock");
            System.out.println("Player 2 WIN ! ! !");
            }
        else if(type[randomNumber].equals("rock")){
            System.out.println(" Tie game");
            }
        else if(type[randomNumber].equals("lizard")){
            System.out.println("rock crushes lizard");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(type[randomNumber].equals("spock")){
            System.out.println("Spock vaporizes rock");
            System.out.println("Player 2 WIN ! ! !");
            }
        }
        
        //lizard
        if(choice1.equals("lizard")){
        if(type[randomNumber].equals("scissors")){
            System.out.println("rock crushes scissors");
            System.out.println("Player 2 WIN ! ! !");
            }
        else if(type[randomNumber].equals("paper")){
            System.out.println("Lizard eats paper");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(type[randomNumber].equals("rock")){
            System.out.println("Scissors decapitates lizard");
            System.out.println("Player 2 WIN ! ! !");
            }
        else if(type[randomNumber].equals("lizard")){
            System.out.println(" Tie game");
            }
        else if(type[randomNumber].equals("spock")){
            System.out.println("lizard poisons Spock");
            System.out.println("Player l WIN ! ! !");
            }
        }
        
        //spock
        if(choice1.equals("spock")){
        if(type[randomNumber].equals("scissors")){
            System.out.println("Spock smashes scissors");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(type[randomNumber].equals("paper")){
            System.out.println("Paper disproves Spock");
            System.out.println("Player 2 WIN ! ! !");
            }
        else if(type[randomNumber].equals("rock")){
            System.out.println("Spock vaporizes rock");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(type[randomNumber].equals("spock")){
            System.out.println(" Tie game");
            }
        else if(type[randomNumber].equals("lizard")){
            System.out.println("lizard poisons Spock");
            System.out.println("Player 2 WIN ! ! !");
            }
        }
        
        }
        
        else if (playerNum.equals("2")){
            System.out.println("Enter 2nd player name");
        Scanner s11 = new Scanner (System.in);
        String player2 = s11.nextLine();
            
        System.out.println("Select 2nd player symbol (rock, paper, scissors, lizard, Spock)");
        Scanner s2 = new Scanner (System.in);
        String choice2 = s2.nextLine();
        System.out.println();
        System.out.println();  
        System.out.println();  
        
        
        //scissors
        if(choice1.equals("scissors")){
        if(choice2.equals("scissors")){
            System.out.println("Tie game");  
            }
        else if(choice2.equals("paper")){
            System.out.println("scissors cuts paper");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(choice2.equals("rock")){
            System.out.println("Rock crushes scissors");
            System.out.println(player2 +" WIN ! ! !");
            }
        else if(choice2.equals("lizard")){
            System.out.println("Scissors decapitates lizard");
            System.out.println(player1 +" WIN ! ! !");
            }
        if(choice2.equals("spock")){
            System.out.println("Spock smashes scissors");
            System.out.println(player2 +" WIN ! ! !");
            }
        }
        
        // paper
        
        // paper vs scissors
        if(choice1.equals("paper")){
        if(choice2.equals("scissors")){
            System.out.println("scissors cuts paper");
            System.out.println(player2 +" WIN ! ! !");
            }
        else if(choice2.equals("paper")){
            System.out.println(" Tie game");
            }
        else if(choice2.equals("rock")){
            System.out.println("paper covers rock ");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(choice2.equals("lizard")){
            System.out.println("Lizard eats paper");
            System.out.println(player2 +" WIN ! ! !");
            }
        else if(choice2.equals("spock")){
            System.out.println("Paper disproves Spock");
            System.out.println(player1 +" WIN ! ! !");
            }
        }
        
        //rock
        if(choice1.equals("rock")){
        if(choice2.equals("scissors")){
            System.out.println("rock crushes scissors");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(choice2.equals("paper")){
            System.out.println("paper covers rock");
            System.out.println(player2 +" WIN ! ! !");
            }
        else if(choice2.equals("rock")){
            System.out.println(" Tie game");
            }
        else if(choice2.equals("lizard")){
            System.out.println("rock crushes lizard");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(choice2.equals("spock")){
            System.out.println("Spock vaporizes rock");
            System.out.println(player2 +" WIN ! ! !");
            }
        }
        
        
        //lizard
        if(choice1.equals("lizard")){
        if(choice2.equals("scissors")){
            System.out.println("rock crushes scissors");
            System.out.println(player2 +" WIN ! ! !");
            }
        else if(choice2.equals("paper")){
            System.out.println("Lizard eats paper");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(choice2.equals("rock")){
            System.out.println("Scissors decapitates lizard");
            System.out.println(player2 +" WIN ! ! !");
            }
        else if(choice2.equals("lizard")){
            System.out.println(" Tie game");
            }
        else if(choice2.equals("spock")){
            System.out.println("lizard poisons Spock");
            System.out.println("Player l WIN ! ! !");
            }
        }
        
        
        //spock
        if(choice1.equals("spock")){
        if(choice2.equals("scissors")){
            System.out.println("Spock smashes scissors");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(choice2.equals("paper")){
            System.out.println("Paper disproves Spock");
            System.out.println(player2 +" WIN ! ! !");
            }
        else if(choice2.equals("rock")){
            System.out.println("Spock vaporizes rock");
            System.out.println(player1 +" WIN ! ! !");
            }
        else if(choice2.equals("spock")){
            System.out.println(" Tie game");
            }
        else if(choice2.equals("lizard")){
            System.out.println("lizard poisons Spock");
            System.out.println(player2 +" WIN ! ! !");
            }
        }
        
      }
        
        System.out.println("To play again TYPE 'Y' or 'N'");
      Scanner s4 = new Scanner (System.in);
       choice4 = s4.nextLine();  
     
    }
        while (choice4.equals("Y"));
        System.out.println();
        System.out.println();  
        System.out.println();  
    }
        
}   















