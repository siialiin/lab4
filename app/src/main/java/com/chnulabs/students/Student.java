package com.chnulabs.students;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private String groupNumber;
    public Student(String name, String groupNumber){
        this.name = name;
        this.groupNumber = groupNumber;
    }
    public String getName(){
        return name;
    }
    public String getGroupNumber(){
        return groupNumber;
    }
    private final static ArrayList<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student("Іван Сидоренко", "K20-1"),
                    new Student("Ернест Сідоров", "K20-1"),
                    new Student("Данило Бейліньский", "K20-3"),
                    new Student("Микита Бровко", "K20-3"),
                    new Student("Сергій Шпорта", "K20-2"),
                    new Student("Александр Котлінський", "K20-2"),
                    new Student("Кирило Смірнов", "K22-1"),
                    new Student("Владислав Балашов", "K20-3")
            )
    );
    public static ArrayList<Student> getStudents(String groupNumber){
        ArrayList<Student> stlist = new ArrayList<>();
        for (Student s : students){
            if (s.getGroupNumber().equals(groupNumber)){
                stlist.add(s);
            }
        }
        return stlist;
    }
}
