class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println(1.0 / 2 * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

class Inheritance {
    public static void main(String args[]) {

        Triangle t = new Triangle();
        t.area(10, 5);

        Circle c = new Circle();
        c.area(5);
    }
}