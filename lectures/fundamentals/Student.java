public class Student {
    public final static int MAGICALCONST = 42;
    private final String id;
    public String name;
    private int age;

    public Student(String name) {
        this.name = name;
        this.id = "ID";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = "ID";
    }

    protected int getAge() {
        return this.age;
    }

    public boolean setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
            return true;
        }
        return false;
    }

    public void showName() {
        System.out.println(this.name);
    }

    public static void showClass() {
        System.out.println("This is the Student class.");
    }
    // Single line comment
    /**
     * Beautiful JavaDoc comment
     */
    /*
    Nasty multi-line comment
    */
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
