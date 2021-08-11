class CarClass{
   String carName;
   int carId;
//Constructor 
CarClass(String name, int id){
	this.carName = name;
	this.carId = id;
}
}

class Driver extends CarClass{
   String driverName;
  Driver(String name, String cname, int cid){
	super(cname, cid);
	this.driverName=name;
 }
}


class TransportCompany{
   
   public static void main(String args[]){
	Driver obj = new Driver("Ama", "Ford", 9988);
		System.out.println(obj.driverName+" is a driver of car Id: "+obj.carId);
   }
}