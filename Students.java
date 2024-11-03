package lab1;

import java.util.ArrayList;

public class Students {
    private ArrayList<Student> students;

    Students(){
        this.students = new ArrayList<>();
    }

    public void add_student(Student student){
        students.add(student);
    }
    public void check_students(){
        int length = students.size();
        for (int i = 0; i < length; i++){
            Student student = students.get(i);
            if ( student.medium_estimation()  >= 3){
                student.setCourse(student.getCourse() + 1);
                continue;
            }
            students.remove(i);
        }
    }

    public void printStudents(int course){
        int length = students.size();
        for (int i = 0; i < length; i++){
            Student student = students.get(i);
            if ( student.getCourse() != course) continue;
            System.out.println(student.getName() + " ");
        }
    }
}
