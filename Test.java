class student {
    String name;
    int age;

    public  String getStudentName() {
        return "My name is " + this.name + " and I am " + this.age + " years old";
    }

}

public class Test {
//    private static String getStudentName(student stu1,student stu2) {
//        return "My name is " + stu1.name + " and I am " + stu1.age + " years old";
//    }

    public static void main(String[] args) {

        student stu1 = new student();
        stu1.name = "John";
        stu1.age = 20;

        student stu2 = new student();
        stu2.name = "Jane";
        stu2.age = 21;

        System.out.println(stu1.getStudentName());
        System.out.println(stu2.getStudentName());
    }
}

