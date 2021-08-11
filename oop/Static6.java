class Static6{
   static int i = 10;
   static String s = "Java";
   int x =7;
   //This is a static method
   public static void main(String args[]) 
   {
       System.out.println("i:"+i);
  System.out.println("s:"+s);
//System.out.println("x:"+x);
   
Static6 ob1 = new Static6();
System.out.println(ob1.x);	

}
}