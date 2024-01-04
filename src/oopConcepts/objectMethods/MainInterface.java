package oopConcepts.objectMethods;

public interface MainInterface {
    final int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface.
class testClass implements MainInterface {

    // Implementing the capabilities of
    // interface.
    public void display() { System.out.println("Geek"); }

    // Driver Code
    public static void main(String[] args)
    {
        testClass t = new testClass();
        t.display();
        System.out.println(a);
    }
}
