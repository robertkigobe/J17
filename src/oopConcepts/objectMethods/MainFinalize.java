package oopConcepts.objectMethods;

public class MainFinalize {
    public static void main(String[] args)
    {
        Test t = new Test();
        System.out.println(t.hashCode());

        t = null;

        // calling garbage collector
        System.gc();

        System.out.println("end");
    }

    @Override protected void finalize()
    {
        System.out.println("finalize method called");
    }
}

class Test {
    int age;
    int speed;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
