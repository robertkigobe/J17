package oopConcepts.objectMethods;

import java.beans.Transient;
import java.util.Objects;

//java 14 researched and done in java 16
//https://howtodoinjava.com/java/java-record-type/
public class MainRecord {


    public static void main(String[] args) {

        System.out.println("\n\n\n================Record Data =================");
        EmployeeRecordStyle employeeRecordStyle = new EmployeeRecordStyle(1001, "Derok", "Dranf");
        System.out.println(employeeRecordStyle.id() + " " + employeeRecordStyle.firstName() + " " + employeeRecordStyle.lastName());
        System.out.println(employeeRecordStyle); //toString method of the record class

        System.out.println("\n\n\n================Pojo Data =================");
        EmployeePojoStyle pojoEmployee = new EmployeePojoStyle(1001, "Derok", "Dranf");
        System.out.println(pojoEmployee.getIdOld() + " " + pojoEmployee.getFirstNameOld() + " " + pojoEmployee.getLastNamePojoStyle());
        System.out.println(pojoEmployee);

        System.out.println("\n\n\n================Canonical Constructor =================");
        Voter voter = new Voter(1001, "Derok", "Dranf", null, 11);
        System.out.println(voter);


    }
}

// Java 16

record EmployeeRecordStyle(int id, String firstName, String lastName) {
}

/////////////////////////////////////////////////////////////Pojo implementation of the Employee Class///////////////////
class EmployeePojoStyle {
    int idPojoStyle;
    String firstNamePojoStyle;
    String lastNamePojoStyle;

    public EmployeePojoStyle(int idPojoStyle, String firstNamePojoStyle, String lastNamePojoStyle) {
        this.idPojoStyle = idPojoStyle;
        this.firstNamePojoStyle = firstNamePojoStyle;
        this.lastNamePojoStyle = lastNamePojoStyle;
    }

    public int getIdOld() {

        return idPojoStyle;
    }

    public void setIdOld(int idOld) {

        this.idPojoStyle = idOld;
    }

    public String getFirstNameOld() {

        return firstNamePojoStyle;
    }

    public void setFirstNameOld(String firstNameOld) {

        this.firstNamePojoStyle = firstNameOld;
    }

    public String getLastNamePojoStyle() {
        return lastNamePojoStyle;
    }

    public void setLastNamePojoStyle(String lastNamePojoStyle) {
        this.lastNamePojoStyle = lastNamePojoStyle;
    }

    @Override
    public String toString() {
        return "EmployeePojoStyle{" +
                "idPojoStyle=" + idPojoStyle +
                ", firstNamePojoStyle='" + firstNamePojoStyle + '\'' +
                ", lastNamePojoStyle='" + lastNamePojoStyle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeePojoStyle that)) return false;
        return idPojoStyle == that.idPojoStyle && firstNamePojoStyle.equals(that.firstNamePojoStyle) && lastNamePojoStyle.equals(that.lastNamePojoStyle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPojoStyle, firstNamePojoStyle, lastNamePojoStyle);
    }
}

record Voter(int id, String firstName, String lastName, String email, int age) {

    public Voter {
        Objects.requireNonNull(email);

        if (age < 18) {
            throw new IllegalArgumentException("A minor may not vote");
        }
    }

}