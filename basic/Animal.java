public class Animal{  

 String name;
 int legs;
 boolean mamal; 
 String sound; 
 
 //Constructor
 public Animal(String nm,int lg, String snd, boolean ma){
	 
 
    name=nm;
	legs=lg;
	sound=snd; 
	mamal=ma;
 }	

 	
 public static void main(String args[]){  
  //Creating objects  
  
  Animal dog=new Animal("Ricki", 4, "Bow Wow", true );
    
  Animal bird=new Animal("Kaputa", 2, "Kak Kak", false );
 
  System.out.println(dog.name + " " + dog.legs + " " + dog.sound + " " + dog.mamal );  
  System.out.println(bird.name + " " + bird.legs + " " + bird.sound + " " + bird.mamal);  
 }  
}
