package oopConcepts.objectMethods;

public class MainHashCode {

    public static void main(String args[])
    {
        StudentHash s = new StudentHash();

        // Below two statements are equivalent
        System.out.println(s);
        System.out.println(s.toString());
    }
}

class StudentHash {
    static int last_roll = 100;
    int roll_no;

    // Constructor
    StudentHash()
    {
        roll_no = last_roll;
        last_roll++;
    }

    // Overriding hashCode()
    @Override public int hashCode() { return roll_no; }

    // Driver code

}
