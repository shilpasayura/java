public class GetHome {
static int home=10;
static int count=0;

public static void move (int step){
//function to take one step toward home.
count+=step;
System.out.println(count);
if (count == home){
    System.out.println("found home " + count);
    //return ;
}
else {
  //take 1 step towards home
  move(1);
}
System.out.println("returning " + count);

}
public static void main(String[] args) {
// call the function 
move(1);
}
}