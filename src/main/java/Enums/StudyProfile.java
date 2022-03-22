package Enums;

public enum StudyProfile {
    /*  Специальности   */;
    public enum Spec {
        IT("Информационные технологии"),
        ENERGY("Энергетика"),
        COOKING("Кулинария"),
        MEDICAL("Медицина"),
        MATH("Математика"),
        LANG("Иностранные языки");

        private String profileName;
        Spec (String profileName) {
            this.profileName = profileName;
        }

        public String getSpec() { return profileName; }
    }
}
