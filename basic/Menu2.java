

import java.util.*;

class Menu2{
 
 public void display_menu() {
 
 Scanner in = new Scanner ( System.in );
   
   System.out.println ("1. One\n");
   System.out.println ("2. Two\n");
   System.out.println ("0. Exit\n");
   
   int n = in.nextInt();
    in.close();
    
    switch (n) {
      case 1:
        System.out.println ( "One 1" );
        one();
        break;
        
      case 2:
        System.out.println ( "Two 2" );
        break;
      case 0:
        System.out.println ( "Exit 0" );
        break;
      default:
  }
 }
  
  public void one() {
   System.out.println ("1. One called \n");
   
   Scanner in = new Scanner ( System.in );
   
  System.out.println ("Enter n1 \n");
   int n1 = in.nextInt();

  System.out.println ("Enter n2 \n");
   int n2 = in.nextInt();
   in.close();
   
   // int n1 = 7;
    //int n2 = 8;
    int n3 =n1 + n2 ;
    System.out.println ("Total : " + n3);
    
    display_menu();
   }
 
  
  public Menu2() {
      
      
    
    display_menu();
    
    
  }
  
  public static void main ( String[] args ) {
    new Menu2();
  }
}

