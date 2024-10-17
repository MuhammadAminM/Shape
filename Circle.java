public class Circle extends Shape {
    private int radius;

    public Circle() {
        super();
        radius = 0;
    }

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print() {
        System.out.println("------ Circle -----");
        super.print();
        System.out.println("Radius  : " + radius);
        System.out.println("Area    = "+3.14+" x "+radius+" x "+radius+" = "+(3.14 * radius * radius));
    }
    
}
