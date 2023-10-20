
package rockpaperscissors;

import java.util.*;

public class Rockpaperscissors {
 
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       while(true){
            String [] rps={"rock","paper","scissors"};
            
            String computermove=rps[new Random().nextInt(rps.length)];
            
            
            String playermove;
            
            while(true){
                System.out.println("play your move: rock, paper, scissors...");
                
                playermove=scanner.nextLine();
                
                
                if(playermove.equals("rock")||playermove.equals("paper")||playermove.equals("scissors")){
                    break;
                }
                System.out.println(playermove+" is not a valid move");
                
            }
           
            System.out.println("computermove: "+computermove);
            
            
            
            if(computermove.equals(playermove)){
                System.out.println("Its a tie!!!");
            }
            else if(playermove.equals("rock")){
                if(computermove.equals("paper"))
                    System.out.println("you lose!!");
                else if(computermove.equals("scissors"))
                    System.out.println("you win!!");
            }
            else if(playermove.equals("paper")){
                if(computermove.equals("scissors"))
                    System.out.println("you lose!!");
                else if(computermove.equals("rock"))
                    System.out.println("you win!!");
            }
            else if (playermove.equals("scissors")){
                if(computermove.equals("rock"))
                    System.out.println("you lose!!");
                else if (computermove.equals("paper"))
                    System.out.println("you win!!");
            }
            
            System.out.println("do you want to play again? ");
            String answer=scanner.nextLine();
            
            
            if(!answer.equals("yes")){
                break;
            }
        }
        
            scanner.close();
        }

}


