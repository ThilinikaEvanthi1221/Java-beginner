
//inheritance - get one class properties to another class
import java.util.*;

class Shape {
    String color;
}

class Triangle extends Shape {

}

public class inherir {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
