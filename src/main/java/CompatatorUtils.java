import Comparators.*;
import Enums.StudentComparatorProfiles;
import Enums.UniversityComparatorProfiles;

public class CompatatorUtils {

    private CompatatorUtils() {}

    public static StudentComparator getComparatorProfile (StudentComparatorProfiles scp) {
        switch (scp) {
            case UNIVERSITY_ID:
                return new StudentCompareUniversityID();
            case FULLNAME:
                return new StudentCompareFullName();
            case CURRENT_COURSE:
                return new StudentCompareCourse();
            case EXAM_AVG_SCORE:
                return new StudentCompareAvgExamScore();
            default:
                return new StudentCompareFullName();
        }
    }

    public static UniversityComparator getComparatorProfile (UniversityComparatorProfiles ucp) {
        switch (ucp) {
            case ID:
                return new UniversityCompareID();
            case FULLNAME:
                return new UniversityCompareFullName();
            case SHORTNAME:
                return new UniversityCompareShortName();
            case YEAR_FOUND:
                return new UniversityCompareYearFound();
            case MAIN_PROFILE:
                return new UniversityCompareProfile();
            default:
                return new UniversityCompareID();
        }
    }
}