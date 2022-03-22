package Comparators;

import Objects.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityCompareShortName implements UniversityComparator {
    @Override
    public int compare(University uOne, University uTwo) {
        return StringUtils.compare(uOne.getShortName(), uTwo.getShortName());
    }
}