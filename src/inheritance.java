class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int h, int l){
        System.out.println(1.0 / 2 * h * l);
    }
}
class EquilateralTriangle extends Triangle{
    @Override
    public void area(int h, int l) {
        System.out.println(1.0 / 2 * l * h);
    }
}

public class inheritance {
    public static void main(String[] args) {

        Triangle t = new Triangle();

        t.area();
    }
}