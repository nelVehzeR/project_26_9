package Comparators;

import Objects.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentCompareUniversityID implements StudentComparator {
    @Override
    public int compare(Student sOne, Student sTwo) {
        return StringUtils.compare(sOne.getUniversityId(), sTwo.getUniversityId());
    }
}