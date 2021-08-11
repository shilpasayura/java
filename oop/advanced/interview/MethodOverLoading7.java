//public 
class Over {

    public void overload(String p, int q) {
        System.out.println("Called overload(" + p + ", " + q + ")");
    }

    // different number of arguments
    public void overload(String p, int q, int w) {
        System.out.println("Called overload(" + p + ", " + q + ", " + w + ")");
    }
    
    // different order of arguments
    public void overload(int q, String p) {
        System.out.println("Called overload(" + q + ", " + p + ")");
    }
    
    // different types of arguments
    public void overload(int p, int q) {
        System.out.println("Called overload(" + p + ", " + q + ")");
    }
    
    // not valid - different return type
    /* 
    public boolean overload(String p, int q) {
        System.out.println("Called overload(" + p + ", " + q + ")");
    }
    */
}


public class MethodOverLoading7 {

    public static void main(String[] args) {

        Over over = new Over();
        
        over.overload("text", 1);
        over.overload(1, "text");
        over.overload(-1, 1);
        over.overload("text", -1, 1);
    }
}
