class Animal{  
 String name;
 int legs;
 boolean mamal;  
}  

public class ObjectDemo{  
 public static void main(String args[]){  
  //Creating objects  
  Animal dog=new Animal();
  dog.name="Ricky";
  dog.legs=4;
  dog.mamal=true;
    
  Animal bird=new Animal();
  bird.name="Kuravi";
  bird.legs=2;
  bird.mamal=false;  
 
  System.out.println(dog.name + " " + dog.legs);  
  System.out.println(bird.name + " " + bird.legs);  
 }  
}
