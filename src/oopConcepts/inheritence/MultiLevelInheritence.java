package oopConcepts.inheritence;

import java.lang.*;

class MlOne {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class MlTwo extends One {
    public void print_for() { System.out.println("for"); }
}

class MlThree extends Two {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
public class MultiLevelInheritence {
    // Drived class
        public static void main(String[] args)
        {
            MlThree g = new MlThree();
            g.print_geek();
            g.print_for();
            g.print_geek();
        }


}
