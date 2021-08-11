class Box{
    int length, width, height;
    public Box(int l, int w, int h){
        length=l;
        width=w;
        height=h;
    }
}


public class Refvardemo{
  public static void main(String args[]){ 
     Box box1 = new Box(5, 8, 10);
    //box1 is the reference variable  
     char[] arr = new char[10];  //arr is the  reference variable
  int x = 10; 
     System.out.println(box1.width);
    }
}