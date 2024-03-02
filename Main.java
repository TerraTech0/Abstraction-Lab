import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {

        System.out.println("================Circle================");
        Circle circle = new Circle(0,1,2.5 );
        System.out.println("X = "+circle.getX()+"\nY = "+circle.getY()+"\nRadius = "+circle.getRadius());
        System.out.println("The Area is: "+circle.calculateAree());
        System.out.println("The Circumference is: "+circle.calculateCircumference());


        System.out.println("================Rectangle================");
        Rectangle rectangle = new Rectangle(1, 0,140, 43);
        System.out.println("X = "+rectangle.getX()+"\nY = "+rectangle.getY()+"\nThe height = "+rectangle.getHeight()+"\nThe width = "+rectangle.getWidth());
        System.out.println("The area is: "+ rectangle.calculateAree());
        System.out.println("The Circumference is: "+ rectangle.calculateCircumference());

        System.out.println("================Triangle================");
        Triangle triangle = new Triangle(1, 0, 34, 20, 10, 20, 30);
        System.out.println("X = "+rectangle.getX()+"\nY = "+rectangle.getY()+"\nHeight = "+ triangle.getHeight()+"\nBase = "+triangle.getBase()+"\nSide1 = "+triangle.getSide1()+"\nSide2 = "+triangle.getSide2()+"\nSide3 = "+triangle.getSide3());
        System.out.println("The Area is: "+triangle.calculateAree());
        System.out.println("The Circumference is: "+triangle.calculateCircumference());



    }
}
