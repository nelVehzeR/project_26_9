package Comparators;

import Objects.University;

public class UniversityCompareYearFound implements UniversityComparator {
    @Override
    public int compare(University uOne, University uTwo) {
        return Integer.compare(uOne.getYearFound(), uTwo.getYearFound());
    }
}