
class Player{
   String name;
   public static int nplayers=0;
   public Player(String n){
      name=n;
      nplayers++;
   }
}

public class ArrTest2{  
  public static void main(String args[]){
  //declare the array 
  Player x[]=new Player[4];
  x[0]=new Player("A");
  x[1]=new Player("B");
  x[2]=new Player("C");
  x[3]=new Player("D"); 
  for(int i=0;i< 4;i++) { //array length 
     System.out.println(x[i].name);       
    }
  }
  }