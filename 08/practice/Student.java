package examples;

import java.util.Collection;
import java.util.Set;

public class Student extends Person {
    private Set<String> subjects;
    public Student(String firstName, String lastName, long birthYear, Gender gender, Collection<String> subjects) {
        super(firstName, lastName, birthYear, gender);
        this.subjects = Set.copyOf(subjects);
    }

    public boolean addSubject(String subject){
        return this.subjects.add(subject);
    }

    public boolean removeSubject(String subject){
        return this.subjects.remove(subject);
    }

}
