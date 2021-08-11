class Triangle {

    public void draw() {
       System.out.println("Default triangle ...");
    }
    
    

    
    public void draw(String color) {
        System.out.println("Triangle of color " + color);
    }
    
    public void draw(int size, String color) {
        System.out.println("Triangle of color " 
                + color + " and scale of " + size);
    }
    
    
}

public class TraingleDraw {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.draw("red");
        triangle.draw(10, "blue");
    }

}
