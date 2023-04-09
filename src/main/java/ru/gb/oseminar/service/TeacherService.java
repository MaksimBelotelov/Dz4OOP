package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.UserComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService <T extends Teacher> implements UserService<T> {
    List<T> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<T>();
    }

    @Override
    public List<T> getAll() {
        UserComparator<T> comparator = new UserComparator<>();
        teachers.sort(comparator);
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        long countMaxId = 0L;
        for (T teacher: teachers){
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        T teacher = (T) new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }
}
