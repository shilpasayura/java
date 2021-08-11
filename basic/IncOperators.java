class IncOperators{
   public static void main(String[] args){
	   int b=0, a = 5;
	    System.out.println("a : " + a + ", b :" + b );
	   
	   b=++a;          // a becomes 6
	   System.out.println("after b=++a > a : " + a + ", b :" + b );
	   
       b=a++;          // a becomes 7
       System.out.println("after b=a++ > a : " + a + " b :" + b );
	   
	   b=--a;          // a becomes 6
	   System.out.println("after b=--a > a : " + a  + ", b :" + b );

       b=a--;          // a becomes 7
       System.out.println("after b=a-- > a : " + a + ", b :" + b );
	   
    }
}
