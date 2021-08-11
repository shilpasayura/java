class StringMethods
{
  public static void main(String args[])
  {
    int n;
    String s = "Java programming", t = "", u = "";
 
    System.out.println(s);
 
    // Find length of string
 
    n = s.length();
    System.out.println("Number of characters = " + n);
 
    // Replace characters in string
 
    t = s.replace("Java", "C++");
    System.out.println(s);
    System.out.println(t);
 
    // Concatenating string with another string
 
    u = s.concat(" is fun");
    System.out.println(s);
    System.out.println(u);
  }
}