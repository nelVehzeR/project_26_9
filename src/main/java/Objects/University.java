package Objects;

public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    String mainProfile;

    public University(String id, String fullName, String shortName, int yearOfFoundation, String mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    public String getId() {
        return id;
    }

    public University setId(String id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public University setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public University setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public int getYearFound() {
        return yearOfFoundation;
    }

    public University setYearFound(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
        return this;
    }

    public String getMainProfile() {
        return mainProfile;
    }

    public University setMainProfile(String mainProfile) {
        this.mainProfile = mainProfile;
        return this;
    }

    @Override
    public String toString () {
        return String.format(
                    "%s, %s, %s, %s, %s",
                    this.id,
                    this.fullName,
                    this.shortName,
                    this.yearOfFoundation,
                    this.mainProfile
                );
    }
}
