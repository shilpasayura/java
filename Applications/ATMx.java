class ATMx{
// Static variables
  public static int totalMoney = 30000;
  public static int numATMs = 2; 
  public int money = 1;
  private static int banks=10;
 
  public void Money(){
    System.out.println(totalMoney+1000);
    System.out.println(this.numATMs+3);
    System.out.println(this.money * 25);
    System.out.println(this.banks);
    this.nATM();
    
  }
  
   public void nATM(){
    System.out.println(numATMs);
 
  }
  
  // A static method
  public static void averageMoney(){
    System.out.println(banks);
    System.out.println(totalMoney);
    //System.out.println(this.totalMoney);
    System.out.println(numATMs);
    // Can not use this.money here because a static method can't access instance variables
    //System.out.println(money);
  }
 public static void main(String[] args) {  
  ATMx.averageMoney();
  ATMx Obj=new ATMx();
  System.out.println(Obj.totalMoney);
  Obj.Money();
}
}
