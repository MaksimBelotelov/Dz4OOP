package ru.gb.oseminar.data;

import java.time.LocalDate;

public class MathTeacher extends Teacher{
    private int arithmeticSkills;
    private int geometricSkills;

    public MathTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long teacherId,
                       int arithmeticSkills, int geometricSkills) {
        super(firstName, secondName, patronymic, dateOfBirth, teacherId);
        this.arithmeticSkills = arithmeticSkills;
        this.geometricSkills = geometricSkills;
    }
}
