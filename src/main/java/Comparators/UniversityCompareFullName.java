package Comparators;

import Objects.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityCompareFullName implements UniversityComparator {
    @Override
    public int compare(University uOne, University uTwo) {
        return StringUtils.compare(uOne.getFullName(), uTwo.getFullName());
    }
}