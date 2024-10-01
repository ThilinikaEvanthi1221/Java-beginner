class pen {
    String type;
    String name;

    public void data() {
        System.out.println(this.type);
        System.out.println(this.name);
    }
}

class Student {
    String name;
    int age;

    public void details() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Hello {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.type = "gel";
        pen1.name = "pen1";

        pen1.data();

        Student st1 = new Student("Thilinika", 21);

        st1.details();
    }
}
