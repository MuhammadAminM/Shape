public class Cube extends Rectangle {
    private int height;
    
    public Cube() {
        super();
        height = 0;
    }
    
    public Cube(String name, String color, int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void print() {
        System.out.println("------ Cube -----");
        super.print();
        System.out.println("Height  : " + height);
        System.out.println("Volume  = "+height+" x "+height+" x "+height+" = "+(height*height*height));
    }
    
}
