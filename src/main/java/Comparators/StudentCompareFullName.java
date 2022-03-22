package Comparators;

import Objects.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentCompareFullName implements StudentComparator {
    @Override
    public int compare(Student sOne, Student sTwo) {
        return StringUtils.compare(sOne.getFullName(), sTwo.getFullName());
    }
}