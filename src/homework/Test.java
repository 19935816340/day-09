package homework;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("张三");
        Student student2 = new Student("李四");
        Student student3 = new Student("王五");
        Student student4 = new Student("赵六");
        Student student5 = new Student("小七");
        Student student6 = new Student("五八");
        //创建出的全部学生
        ArrayList<Student> sList = new ArrayList<>();
        sList.add(student1);
        sList.add(student2);
        sList.add(student3);
        sList.add(student4);
        sList.add(student5);
        sList.add(student6);
        System.out.println(sList);

        //旷课学生
        ArrayList<Student> kList = new ArrayList<>();
        kList.add(sList.get(1));
        kList.add(sList.get(4));
        System.out.println(kList);



        Teacher t = new Teacher("张老师");

        Course course = new Course("Java",t,sList);

        t.callName(kList);


        //检测旷课学生上课状态是否为false
        System.out.println(sList.get(1).getName()+"的上课情况为:"+sList.get(1).getAttendance());

        //检测上课学生上课状态是否为true
        System.out.println(sList.get(5).getName()+"的上课情况为:"+sList.get(5).getAttendance());

        course.show(kList,sList);


    }
}
