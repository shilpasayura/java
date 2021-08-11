
import java.util.Random; 

class Sea {
    
 public static final int rows = 5;
 public static final int cols = 5;
 public static final String Ship = "@";

 public static int nships = 5;
 public static int nmissiles = 0; 
 public static int ndestroyed = 0;

public static String [][] grid = new String[rows][cols]; 
   
 
void createShips(){
for (int i=0 ;i < rows; i++){ 
   for (int j=0 ;j < cols; j++){
    grid[i][j]="";
}   
}

int ships=0;
 Random r = new Random();

while (ships < nships){
  int x = r.nextInt(rows); 
  int y = r.nextInt(cols); 
  if (grid[x][y] != Ship){  
      grid[x][y] = Ship;
      ships++;
   }
 }

}
 
 
void dispsea(){
for (int i=0 ;i < rows; i++){ 
  for (int j=0 ;j < cols; j++){
     if (grid[i][j] == Ship){  
        System.out.print (" " + Ship); 
}
else {
    System.out.print (" ~"); 
}
}   

System.out.println ();
} // for i
} //display sea 
 

void missile() {
  
  nmissiles++;
  Random r = new Random();
  int x = r.nextInt(rows); 
  int y = r.nextInt(cols); 
  
  if (grid[x][y] == Ship){  
      grid[x][y] = "";
      nships--;
      System.out.println (x + "," + y + " x " + this.nships  );
      
      ndestroyed++;
   }
   else {   
       System.out.println (x + "," + y  + " " + this.nships  );
   }
   
   System.out.println();
}// missioe 

}// sea

public class ShipWar{

// Class variables 

    public static void main(String args[]){
        
     Sea sea =new Sea();
     sea.createShips();
     int ships =0;
     while (sea.nships >0) {
     sea.dispsea();
     sea.missile();     
     }

System.out.println("Game over");
System.out.println(sea.ndestroyed + " ships destroyed  ");
System.out.println(sea.nmissiles+  " fired ");

    }
}



 
 


