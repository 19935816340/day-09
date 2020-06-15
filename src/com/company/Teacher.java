package com.company;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private Student student;

    public Teacher(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public List<String> setChuqin(Student student){
        List<String> chuqinbiao = new ArrayList<String>();
        for (int i = 0; i < student.; i++) {
            String a = student.getChuqin();
            if (a == "出勤")
                chuqinbiao.add(getName());

        }
        return chuqinbiao;
    }*/
}
