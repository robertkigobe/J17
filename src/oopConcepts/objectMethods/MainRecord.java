package oopConcepts.objectMethods;

import java.util.Objects;

//java 14 researched and done in java 16
//https://howtodoinjava.com/java/java-record-type/
public class MainRecord {


    public static void main(String[] args) {

        // Creating object with default constructor
        Employee e1 = new Employee(1001, "Derok", "Dranf");

        // Auto generated getter methods
        System.out.println(e1.id() + " " + e1.firstName()
                + " " + e1.lastName());

        // Auto-generated toString() method
        System.out.println(e1);
    }
}

// Java 16
// used when you need an imutable class with getters only
//used when you need a DTO
record Employee(int id, String firstName, String lastName) {
}

//Old implementation of the Employee Class
class EmployeeOld {
    int idOld;
    String firstNameOld;
    String lastNameOld;

    public String getFirstNameOld() {
        return firstNameOld;
    }

    public void setFirstNameOld(String firstNameOld) {
        this.firstNameOld = firstNameOld;
    }

    public int getIdOld() {
        return idOld;
    }

    public void setIdOld(int idOld) {
        this.idOld = idOld;
    }

    @Override
    public String toString() {
        return "EmployeeOld{" +
                "idOld=" + idOld +
                ", firstNameOld='" + firstNameOld + '\'' +
                ", lastNameOld='" + lastNameOld + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeOld that)) return false;
        return idOld == that.idOld && firstNameOld.equals(that.firstNameOld) && lastNameOld.equals(that.lastNameOld);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOld, firstNameOld, lastNameOld);
    }
}
