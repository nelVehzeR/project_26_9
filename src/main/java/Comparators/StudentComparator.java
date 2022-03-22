package Comparators;

import Objects.Student;
import java.util.Comparator;

public interface StudentComparator extends Comparator<Student> {
    int compare(Student sOne, Student sTwo);
}