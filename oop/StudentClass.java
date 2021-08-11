class Address
{
   int streetNum;
   String city;
   String country;
   Address(int street, ,String city , String country)
   {
       this.streetNum=street;
       this.city =city;
       this.country = country;
   }
}

class StudentClass
{
   int indexNo;
   String Name;

   //Creating relationship with Address class

    Address studentAddr; 

//Constructor 
   StudentClass(int index, String name, Address addr){
   this.indexNo=index;
   this.Name=name;
    this.studentAddr = addr;
   }

   public static void main(String args[]){
       Address ad = new Address(55, "Kandy",  "Sri Lanka");
       StudentClass obj = new StudentClass(123, "Cima", ad);
       System.out.println(obj.indexNo);
       System.out.println(obj.studentName);
     System.out.println(obj.studentAddr.city);
       System.out.println(obj.studentAddr.country);
   }
}
