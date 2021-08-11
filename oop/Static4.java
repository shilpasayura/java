class Static4{
   static int var1=77; 
   //non-static variable
   String var2="Niranjan";

   public static void main(String args[])
   {

/*
static variables can be   
accessed directly without any instances.
static variables are shared,
*/

Static4 ob1 = new Static4();
Static4 ob2 = new Static4();

System.out.println("ob1 integer:"+ob1.var1);
System.out.println("ob1 String:"+ob1.var2);
	System.out.println("ob2 integer:"+ob2.var1);
	System.out.println("ob2 STring:"+ob2.var2);

/* 
overwrite default  values
 */


	ob1.var1=88;
	ob1.var2="I'm Object1";
 
ob2.var1=99;
ob2.var2="I'm Object2";

System.out.println("ob1 integer:"+ob1.var1);
System.out.println("ob1 String:"+ob1.var2);
	System.out.println("ob2 integer:"+ob2.var1);
	System.out.println("ob2 STring:"+ob2.var2);
   }
}