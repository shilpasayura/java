public class Person { 
  private String name="No Name"; 
  public String getName() { 
    return this.name; 
  } 
  public void setName(String N) { 
    this.name = N; 
  } 
} 

//Teacher class extends from Person class.
public class Teacher extends Person { 
  private String subject="No Subject"; 
    
  public String getSubject() { 
    return this.subject; 
  } 
  public void setSubjevt(String s) { 
    this.subject = s; 
  } 
}


publiv class School  extends Person { 
  
  public static void main(String args[]) { 
  Teacher T1=new Teacher();
   System.out.println(T1.getName()); 
  } 
}