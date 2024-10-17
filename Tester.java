import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose one :\n 1. Rectangle \n 2. Circle \n 3. Cube");
        String pilih = input.nextLine();

        if (pilih.equals("1")) {
            System.out.print("Masukkan Color : ");
            String color = input.nextLine();
            System.out.print("Masukkan Length : ");
            int length = input.nextInt();
            System.out.print("Masukkan Width : ");
            int width = input.nextInt();
            Rectangle rectangle = new Rectangle("Rectangle", color, length, width);
            System.out.println("------ Rectangle -----");
            rectangle.print();
            System.out.println("Area    = "+length+" x "+width+" = "+(length*width));
        } else if (pilih.equals("2")) {
            System.out.print("Masukkan Color : ");
            String color = input.nextLine();
            System.out.print("Masukkan Radius : ");
            int radius = input.nextInt();
            Circle circle = new Circle("Circle", color, radius);
            circle.print();
        } else if (pilih.equals("3")) {
            System.out.print("Masukkan Color : ");
            String color = input.nextLine();
            System.out.print("Masukkan Length : ");
            int length = input.nextInt();
            System.out.print("Masukkan Width : ");
            int width = input.nextInt();
            System.out.print("Masukkan Height : ");
            int height = input.nextInt();
            Cube cube = new Cube("Cube", color, length, width, height);
            cube.print();
        }
    }
}
    

