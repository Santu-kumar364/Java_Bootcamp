package Java_Bootcamp.OOPS.polymorphism;

// parant class
class Shape{
    double side;
    public Shape(double side) {
        this.side = side;;
    }
    void square() {
        System.out.println("this is shape class and side is: " + side);
    }
}

class A extends Shape {
     public A(double side) {
        super(side);
    } 
    
    @Override
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

public class OverRiding {
    public static void main(String[] args) {
        Shape result = new A(7.2);
        Shape s = new Shape(5);
        B volume = new B(4.2);

        s.square();
        result.square();
        volume.cube();
    }
}





