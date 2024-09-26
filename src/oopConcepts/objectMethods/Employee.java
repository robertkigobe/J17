package oopConcepts.objectMethods;

import java.beans.Transient;

public record Employee(
        @Transient Long id,
        String firstName,
        String lastName,
        String email,
        int age) {
    // ...
}
