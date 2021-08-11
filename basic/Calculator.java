public class Calculator{
    static int p=10;
    static int[] arr={2,3,5,6};
    
    static void prtarr(int[] arr){
       for (int i=0 ; i< 4; i++){
            System.out.println(arr[i]);
           }
    }
    static void hello(){
      System.out.println(p);
      System.out.println("hello");
    }
    public static void main(String[] args){
		System.out.println(p);
      int x = 2;
      
            int y =3 ;
            int z=x+y;      
           System.out.println(z);
           hello();
           p=100;
           hello();
           prtarr(arr);
    }
} 
