import java.util.Scanner;

public class lab1 {
    public class Shape {
        private String name;

        public Shape(String name) {
            this.name = name;
        }

        /**
         * returns the name of the shape
         */
        public String getName() {
            return name;
        }

        /**
         * returns the area of the shape
         */
        public double getArea() {
            return 0.0;
        }

        public void printDimensions() {
            System.out.println("No dimensions");
        }
    }
    public class Square extends Shape {
        int length;
        int height;
        public Square() {
            super("Square");
        }
        public void setDimensions(int _length, int _height) {
            this.length = _length;
            this.height = _height;
        }
        public void printDimensions() {
            System.out.println("Square dimensions: Length = "+Integer.toString(length)+", Height = "+Integer.toString(height));
        }
        public double getArea() {
            return (length*height);
        }

    }
    public class Circle extends Shape {
        float radius;
        public Circle() {
            super("Circle");
        }
        public void setDimensions(float _radius) {
            this.radius = _radius;
        }
        public void printDimensions() {
            System.out.println("Circle dimensions: Radius = "+Float.toString(radius));
        }
        public double getArea() {
            return(3.14159*(radius*radius));
        }
    }
    public class Triangle extends Shape {
        int s1,s2,s3;
        public Triangle() {
            super("Triangle");
        }
        public void setDimensions(int _s1,int _s2, int _s3) {
            this.s1 = _s1;
            this.s2 = _s2;
            this.s3 = _s3;
        }
        public void printDimensions() {
            System.out.println("Triangle dimensions: Side 1 = "+Integer.toString(s1)+", Side 2 = "+Integer.toString(s2)+", Side 3 = "+Integer.toString(s3));
        }
        public double getArea() {
            float s = (s1+s2+s3)/2.0f;
            double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
            return(area);
        }
    }
    public class EquilateralTriangle extends Shape {
        int sideLength;
        public EquilateralTriangle() {
            super("Equilateral Triangle");
        }
        public void setDimensions(int _sideLength) {
           this.sideLength = _sideLength;
        }
        public void printDimensions() {
            System.out.println("Triangle dimensions: Sides "+Integer.toString(sideLength));
        }
        public double getArea() {
            float s = (sideLength*3)/2.0f;
            double area = Math.sqrt(s*(s-sideLength)*(s-sideLength)*(s-sideLength));
            return(area);
        }
    }
    public void testShapes() {
        Square testSquare = new Square();
        Circle testCircle = new Circle();
        Triangle testTriangle = new Triangle();
        EquilateralTriangle testET = new EquilateralTriangle();

        Scanner scanner = new Scanner(System.in);

        int length,height;

        System.out.println("Enter Square length:");
        length = scanner.nextInt();
        System.out.println("Enter Square height:");
        height = scanner.nextInt();

        testSquare.setDimensions(length,height);
        System.out.println(testSquare.getArea());

        System.out.println("Enter Circle radius:");
        float radius = scanner.nextFloat();

        testSquare.setDimensions(radius);
        System.out.println(testCircle.getArea());

        testET.setDimensions(3);
        System.out.println(testET.getArea());
    }
    public static void main(String[] args) {
        System.out.println("Hi");
        lab1 test = new lab1();
        test.testShapes();
    }
}