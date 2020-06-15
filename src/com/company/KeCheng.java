package com.company;

import java.util.List;

public class KeCheng {

    private String name;
    private Teacher teacher;
    private Student student;

    KeCheng(String name,Student student,Teacher teacher){

    }

    public KeCheng(String name, Teacher teacher, List<Student> studentList) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void show(){
        System.out.println("课程名称："+name);
        /*System.out.println("授课老师："+teacher.getName());*/
        System.out.println("上课："+student.getName());
        System.out.println("旷课："+student.getName());
    }
}
