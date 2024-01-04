package oopConcepts.objectMethods;

public class MainToString {

    public static void main(String[] args) {

        Student s = new Student();

// toString method
        System.out.println(s);
        System.out.println(s.toString());

        //
    }
}

class Student {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

