public class Shape {
    private String name;
    private String color;

    public Shape() {
        name = "Unknown";
        color = "Unknown";
    }
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Name    : " + name);
        System.out.println("Color   : " + color);
    }
    
}
