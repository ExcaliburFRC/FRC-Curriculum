package examples;

public class Person {
    private String firstName, lastName;
    private final long birthYear;
    private Gender gender;

    public Person(String firstName, String lastName, long birthYear, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public long getBirthYear() {
        return birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return String.join(" ", getFirstName(), getLastName());
    }

    public enum Gender {MALE, FEMALE}
}