package Java_Bootcamp.OOPS.Inheritance;

// parant class
class Shape{
    double side;
    public Shape(double side) {
        this.side = side;
    }
    void square() {
        System.out.println("Parent is called with side: " + side);
    }
}

class A extends Shape {
     public A(double side) {
        super(side);
    } 
    void square(){
        double area = side*side;
        System.out.println("Area of square is: " + area);
    }

}

class B extends Shape {
    public B(double side) {
        super(side);
    }
    void cube(){
        double area = side*side*side;
        System.out.printf("Area of cube is: %.3f " , area);
    }
}

public class Hierarcial {
    public static void main(String[] args) {
        Shape side = new Shape(4);
        Shape result = new A(7.2);
        B volume = new B(4.2);

        side.square();
        result.square();
        volume.cube();
    }
}





