package lab1;


import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private Integer course;
    private ArrayList<Integer> estimations;

    Student(String name, String group, int course){
        this.estimations = new ArrayList<>();
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public void add_estimation(int value){
        estimations.add(value);
    }

    public double medium_estimation(){
        int length = estimations.size();
        double sum = 0;
        for (int i = 0; i < length; i++) sum += estimations.get(i);
        return sum/length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getCourse() {
        return course;
    }

    public ArrayList<Integer> getEstimations() {
        return estimations;
    }
}
