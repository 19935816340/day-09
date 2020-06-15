package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张老师");

        Student student1 = new Student("张三");
        Student student2 = new Student("李四");
        List<Student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        KeCheng keCheng = new KeCheng("java",teacher,arrayList);



    }
}
