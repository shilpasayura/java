import java.util.*; 


class Player {
    String Name;
   
    int score =0;
    int fours =0; 
    int sixes =0; 
    int playing=0;
    int howout ;
    
    Player(String name){
        this.Name =name;
        System.out.println(this.Name);
    }
    
    void play() {
        this.playing=1;
    }
   
    void runs(int r) {
        this.score +=r;
        
        if (r==4){
            this.fours++;
        }
        else if (r==6){
            this.sixes++;
        }
        else{
           
        }       
        System.out.println (this.Name + " " + r );
    }
    
    void out(int ho) {
        this.playing=-1;
        this.howout=ho;
    }
    
     
}

class Team {
    String Name;
    int score; 
    Team (String name){
        this.Name=name;
   System.out.println(this.Name);
    }
    
}


class Game {
    Team Home;
    Team Visitors;
    int maxovers ;
    int innings;
    int curinning;
    String toss;
    Team battingteam;
    Team bowlingteam;
    
    Player playingBatsman;
   Player nonplayingBatsman;
   
    
    //constructor 
    Game(String home, String visit, int overs, String fbat){
      
      Team Home = new Team(home);
      Team Visitors = new Team(visit);
      
      if (fbat==Home.Name){
          this.battingteam=Home;
          this.bowlingteam=Visitors;
      }
      else{
          this.battingteam=Visitors;
          this.bowlingteam=Home;
      }
      
    System.out.println("Bat : " + battingteam.Name);
    
      System.out.println("Bowl : " + bowlingteam.Name);
    }
    
  int bowl (){   
   // int sc =(int) Math.randomm() * 10;
   int sc= (int) (Math.random() *  10); 
    return sc; 
        
    }
    
   void swapbatsman(){
       Player temp;
 temp= this.playingBatsman;
 this.playingBatsman=
 this.nonplayingBatsman; this.nonplayingBatsman=temp;
       }
    
}


public class Cricket{

    public static void main(String args[]){
    int novers=6;
    
    
   Game game = new 
   Game("SL", "IN",novers , "SL");

  Player batsman1 =new Player("Danushka"); 
   batsman1.play();
   
   Player batsman2 =new Player("Kusal"); 
   batsman2.play();
   
  // Player game.playingBat= batsman1;
   //Player game.NonplayingBat= batsman2;
   
   game.playingBatsman = batsman1;
   game.nonplayingBatsman = batsman2;
  
// 
for (int ov = 0 ; ov < novers ; ov++){
    System.out.println( "Over " + ov);
    
    for (int b = 1 ; b < 7 ; b++){
       System.out.println(game.playingBatsman.Name + " facing");
       
       
    int result = game.bowl();
      
    switch (result) {
  case 0:
   System.out.println("No Run");
  case 1:
 game.playingBatsman.runs(1);
 game.swapbatsman();
    break;
  case 2: game.playingBatsman.runs(2);
    break; 
  case 3:
   game.playingBatsman.runs(3);
   game.swapbatsman();
   
    break; 
  case 4:
   game.playingBatsman.runs(4);
    break; 
case 5:
   game.playingBatsman.runs(5);
   game.swapbatsman();
    break; 
  case 6:
 game.playingBatsman.runs(6);
    break; 
   default:
   
     break;
}
game.battingteam.score+=result;
        
    System.out.println( "Ball " + ov + "." + b + " : " + result + " " + game.battingteam.score
   );
    
    
    }
    
    
    } // overs 

    }
}
