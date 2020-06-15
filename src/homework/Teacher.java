package homework;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;


    public Teacher(String name) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void callName(ArrayList<Student> kStudents){
        for (int i = 0; i < kStudents.size(); i++) {
            Student ss = kStudents.get(i);
            ss.setAttendance(false);
        }


    }
}
