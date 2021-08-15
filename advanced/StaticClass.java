class StaticClass{
  //Static class
  static String str1="Inside Static Class";
  int x=10;
  static class X{
      int y=20;
      static String str2="Inside Class X";
  
     public void display(){
      System.out.println(this.y);
      //System.out.println(this.super().x);
     }  
  }
  
  
  public static void main(String args[]){
     System.out.println(StaticClass.str1);
     System.out.println(StaticClass.X.str2);
     //System.out.println(X.str2); // Error
    //System.out.println(X.y);
     StaticClass.X sx=new StaticClass.X();
     System.out.println(sx.y);
     sx.display();

  }
}
