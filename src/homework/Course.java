package homework;

import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students;


    Course(String name, Teacher teacher, ArrayList<Student> students){
        this.name = name;
        this.teacher = teacher;
        this.students = students;
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
        this.teacher= teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    public void show(ArrayList<Student> students1,ArrayList<Student> students2){
        //旷课的人的名单
        ArrayList<String> kName = new ArrayList<>();
        //上课的人的名单
        ArrayList<String> sName = new ArrayList<>();
        //旷课的人
        for (int i = 0; i < students1.size(); i++) {
            String a = students1.get(i).getName();
            kName.add(a);
        }

        for (int i = 0; i < students2.size(); i++) {
            Boolean b = students2.get(i).getAttendance();
            if (b){
                String c = students2.get(i).getName();
                sName.add(c);
            }
        }

        System.out.println("课程名称:"+name);
        System.out.println("授课老师:"+ teacher.getName());
        System.out.println("上课:"+sName);
        System.out.println("旷课:"+kName);
    }
}
