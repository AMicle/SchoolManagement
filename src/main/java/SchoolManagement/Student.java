package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Student implements Students{

    private Integer id;
    private String name;
    private java.util.List<String> StudentsList = new ArrayList();
    private List<String> CoursesList = new ArrayList();
    private List<ArrayList<String>> List = new ArrayList();
    private String surname;

    public Student() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getStudentsList() {
        return this.StudentsList;
    }

    public void setListOfLists(List<ArrayList<String>> listOfLists) {
        this.List = listOfLists;
    }

    public List getCourses() {
        return this.CoursesList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void enroll(String newName) {
        this.name = newName;
        this.StudentsList.add(newName);
        this.List.add((ArrayList)this.StudentsList);
    }

    public void attentCourses(String course) {
        this.CoursesList.add(course);
        this.List.add((ArrayList)this.CoursesList);
    }

    public void checkGrades(String name, String course) {
    }
}
