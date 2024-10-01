//single level inheritance

class Shape {
    public static void main(String[] args) {
        System.out.println("area:");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

public class singleint {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(5, 4);

    }
}
