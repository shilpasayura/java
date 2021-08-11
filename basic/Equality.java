class Car{  
 int x;  
Car(int i){
x=i;
}
}

public class Equality {

public static void main (String args[]) {
Car Obj1, Obj2, Obj3;
Obj1 = new Car(7);
Obj2= Obj1;

System.out.println(Obj1.x+ " :  " + Obj2.x);

System.out.println("Same? " + (Obj1 == Obj2));

Obj3= new Car(7);
 System.out.println(Obj1.x+ " :  " + Obj2.x);

System.out.println("Same? " + (Obj1 == Obj3));
System.out.println(Obj1.equals(Obj3));
}
}
