package oopConcepts.inheritence;
// Java program to illustrate the
// concept of Multiple inheritance
import java.lang.*;

interface MiOne {
    public void print_geek();
}

interface MiTwo {
    public void print_for();
}

interface MiThree extends MiOne, MiTwo {
    public void print_geek();
}
class MiChild implements MiThree {
    @Override public void print_geek()
    {
        System.out.println("Geeks");
    }

    public void print_for() { System.out.println("for"); }
}

public class MultipleInheritance {
    public static void main(String[] args)
    {
        MiChild c = new MiChild();
        c.print_geek();
        c.print_for();
        c.print_geek();
    }
}
