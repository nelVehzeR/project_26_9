package Comparators;

import Objects.Student;

public class StudentCompareCourse implements StudentComparator {
    @Override
    public int compare(Student sOne, Student sTwo) {
        return Integer.compare(sOne.getCurrentCourseNumber(), sTwo.getCurrentCourseNumber());
    }
}