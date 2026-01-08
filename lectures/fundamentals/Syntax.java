public class Syntax {
    public static void main(String[] args) {
        helloWorld("Hello, World!");
        doSomething("example input");
        System.out.println(add(5,10));
        System.out.println(addStrings("Hello, ", "Java!"));

        Student stu1 = new Student("Alice", 20);
        System.out.println(stu1.name);
        System.out.println(stu1);

        Student stu2 = new Student("Bob");
        stu2.showName();
        Student.showClass();

        int someNumber = 34;
        if (someNumber > 10 && someNumber < 50) {
            int v = 10;
            System.out.println("Number is between 10 and 50");
        } else if (someNumber <= 10 || someNumber >= 50) {
            int v = 15;
            System.out.println("Number is 10 or less");
            
        } else {
            int v = 20;
            System.out.println("Number is out of range");
        }

        String someString = "spring";
        switch (someString) {
            case "spring":
                System.out.println("It's spring!");
                break;
            case "summer":
                System.out.println("It's summer!");
                break;
            case "autumn":
                System.out.println("It's autumn!");
                break;
            case "winter":
                System.out.println("It's winter!");
                break;
            default:
                System.out.println("Unknown season");
                break;
        }

        boolean condition = true;
        for (int i = 0; condition;) {
            System.out.println("For loop iteration: " + i);
            i++;
            condition = i < 5;

        }

        condition = true;
        int timer = 0;
        while (condition) {
            System.out.println("While loop running");
            condition = timer < 3;
            timer++;
        }

        condition = false;
        timer = 0;
        do {
            System.out.println("Do-while loop running");
            condition = timer < 2;
            timer++;
        } while (condition);

        String[] fruits = {"apple", "banana", "cherry"};
        printList(fruits);
        String[] food = new String[3];
        food[0] = "pizza";
        food[1] = "burger";
        food[2] = "pasta";
        System.out.println(food);

        byte a = (byte)255;
        short b = 128;
        int c = 128;
        long d = 2147483647L + 10;
        float e = 2.17f;
        double f = 3.141592653589793;
        char g = 'A';
        System.out.println(d + f);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println((short)g);

        Student[] students = new Student[2];
        students[0] = new Student("Charlie", 22);
        students[1] = new Student("Diana", 21);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        printGenList(students);

        System.out.println(stu1.getAge());
        System.out.println(stu1.setAge(25));
        System.out.println(stu1.getAge());
        System.out.println(stu1.setAge(200));
    }

    public static void helloWorld(String word) {
        System.out.println(word);
    }

    public static void doSomething(String input) {
        System.out.println("you gave this:" + input);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String addStrings(String a, String b) {
        return a + b;
    }

    public static void printList(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public static <AnyType> void printGenList(AnyType[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}