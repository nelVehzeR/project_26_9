package Comparators;

import Objects.Student;

public class StudentCompareAvgExamScore implements StudentComparator {
    @Override
    public int compare(Student sOne, Student sTwo) {
        return Float.compare(sOne.getAvgExamScore(), sTwo.getAvgExamScore());
    }
}