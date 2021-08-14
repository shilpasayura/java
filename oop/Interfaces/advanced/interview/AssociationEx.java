/*
Association in Java is a connection or relation between two separate classes 
that are set up through their objects. 
Association relationship indicates how objects know each other 
and how they are using each other’s functionality. 
It can be one-to-one, one-to-many, many-to-one and many-to-many.
*/

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Address {

    private String city;
    private String zip;

    public Address(String city, String zip) {
        this.city = city;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}

public class AssociationEx {

    public static void main(String[] args) {

        Person p1 = new Person("Niranjan");
        Person p2 = new Person("Mihiri");

        Address a1 = new Address("Kandy", "20450");
        Address a2 = new Address("Colombo", "00008");

        // Association between the classes in the main method 
        System.out.println(p1.getName() + " lives at address "
                + a1.getCity() + ", " + a1.getZip()
                + " but he also has an address at "
                + a2.getCity() + ", " + a2.getZip());

        System.out.println(p2.getName() + " lives at address "
                + a2.getCity() + ", " + a2.getZip()
                + " but she also has an address at "
                + a1.getCity() + ", " + a1.getZip());
    }

}

