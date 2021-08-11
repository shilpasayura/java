public class IntegerParseIntRadix{  
    public static void main(String[] args) {          
      int a = Integer.parseInt("101", 2);  
             int b = Integer.parseInt("FF", 16);  
             int c = Integer.parseInt("177", 8);        
             System.out.println("Value = "+a);  
             System.out.println("Value = "+b);  
             System.out.println("Value = "+c);  
    }  
}  