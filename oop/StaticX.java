public class StaticX {

public void StaticX()  
    {  
     System.out.println("Constructor ");  
    }
    
   
 { System.out.println("Instance Vsarilre");
    
    }
  
    
    static {  
   System.out.println("static block");  
    }  
     
public static void main(String[] args) {  

System.out.println("Main method is executed.");


   StaticX x = new StaticX();  
    
  }  
}

