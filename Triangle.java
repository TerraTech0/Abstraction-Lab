public class Triangle extends Shape{
    public double height;
    public double base;
    public double side1;
    public double side2;
    public double side3;


    public Triangle(int x, int y, double height, double base, double side1, double side2, double side3) {
        super(x, y);
        this.height = height;
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double calculateAree() {
        return 0.5 * base * height;
    }

    @Override
    public double calculateCircumference() {
        return side1 + side2 + side3;
    }
}
