import Enums.StudyProfile;
import Objects.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University psuti = new University(
                "PSUTI",
                "Поволжский государственный университет телекоммуникаций и информатики",
                "ПГУТИ",
                1953,
                StudyProfile.Spec.IT.getSpec()
        );
        University med = new University(
                "MED",
                "Самарский государственный медицинский университет",
                "СГМУ",
                1919,
                StudyProfile.Spec.MEDICAL.getSpec()
        );

        Student Zaycev = new Student(
                "Яйцев Зайцеслав Ильич",
                "PSUTI",
                4,
                0.3f
        );
        Student Mironov = new Student(
                "Миронов Арсений Валерьевич",
                "MED",
                2,
                0.9f
        );

        List<University> universities = new ArrayList<University>();
        universities.add(psuti);
        universities.add(med);

        List<Student> students = new ArrayList<Student>();
        students.add(Zaycev);
        students.add(Mironov);

        universities.forEach(university -> {
            System.out.println(university.toString());
        });

        students.forEach(student -> {
            System.out.println(student.toString());
        });
    }
}
