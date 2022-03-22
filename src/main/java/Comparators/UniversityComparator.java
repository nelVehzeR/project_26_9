package Comparators;

import Objects.University;
import java.util.Comparator;

public interface UniversityComparator extends Comparator<University> {
    int compare(University uOne, University uTwo);
}