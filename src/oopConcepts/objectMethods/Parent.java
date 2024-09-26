package oopConcepts.objectMethods;

public class Parent {

    // instance variable
    int a = 36;

    // static variable
    static float x = 12.2f;
}

class Base extends Parent {
    void GFG()
    {
        // referring super class(i.e, class Parent)
        // instance variable(i.e, a)
        super.a = 1;
        System.out.println("The super amount is "+a);

        // referring super class(i.e, class Parent)
        // static variable(i.e, x)
        super.x = 60.3f;

        System.out.println("The super amount is "+x);

        // static variable(i.e, x)
        int y = this.a + 25;

        System.out.println("The current amount is "+y);

    }
    public static void main(String[] args)
    {
        new Base().GFG();
    }
}
