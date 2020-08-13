package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

    public class Teachers implements Teacher{

        private List<String> Curricula = new ArrayList();
        enum Course {ROMANA, ENGLEZA, ISTORIE, MATEMATICA};

        public Teachers() {
        }

        public void giveGrade(Student student, String name) {
            if (student.getStudentsList().contains(student.getName())) {
                System.out.println("The mark for the student " + name + " for the course/courses " + student.getCourses() + " is 10");
            } else {
                System.out.println("The student" + name + " has not attended to the course of + " + student.getCourses() + " the mark is 4");
            }

        }

        public void teachCourses() {
            for (Course c : Course.values()) {
                System.out.println("The list with all courses available" +c);
            }
        }

        public void defineCurricula() {
            for (Course c : Course.values()) {
                System.out.println("The course" +c + " is held between 9:00 - 14:00");
            }

        }


}
