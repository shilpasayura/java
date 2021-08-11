public class ForEx {
public static void main(String[] args) {
// Loop through 0, 1, 2, 3 and 4.

for (int i =0;i < 10; i++){
  if (i < 3){
   continue;
  }
  if (i >= 3){
   break;
  } 
  System.out.println(i);
 }
 System.out.println("Bye");
  }
}

