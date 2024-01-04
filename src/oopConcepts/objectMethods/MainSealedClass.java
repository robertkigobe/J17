package oopConcepts.objectMethods;
//https://howtodoinjava.com/java15/sealed-classes-interfaces/
//tested in java 15 and implemented in java 17
public class MainSealedClass {

    public static void main(String args[])
    {
//creating an instance of GrandFather class
        Person grandfather = new GrandFather(87, "Albert");
        grandfather.name = "Albert";
        System.out.println("The age of grandfather is: "+getAge(grandfather));
    }
    // getting the age of the Person
    public static int getAge(Person person)
    {
//if the person is an instance of the Father class, returns the age of the father
        if (person instanceof Father)
        {
//cast the person class to Father class and get the age
            return ((Father) person).getFatherAge();
        }
//if the person is an instance of the GrandFather class, returns grandfather age
        else if (person instanceof GrandFather)
        {
            return ((GrandFather) person).getGrandFatherAge();
        }
//returns nothing if does not match with any of the above conditions
        return -1;
    }
}
//the class person extends only Father and GrandFather class
abstract sealed class Person permits Father, GrandFather
{
    String name;
    String getName()
    {
        return name;
    }
}

final class Father extends Person
{
    String name;
    int age;
    //constructor of the Father class
    Father(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    int getFatherAge()
    {
        return age;
    }
}
//non-sealed class extends unknown subclass (Person)
non-sealed class GrandFather extends Person
{
    int age;
    GrandFather(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    int getGrandFatherAge()
    {
        return age;
    }
}
