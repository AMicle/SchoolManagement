package SchoolManagement;

public class main {
    public static void main(String[] args) {
        Student ob1 = new Student();
        ob1.enroll("Alexandru");
        ob1.enroll("Daniel");
        ob1.enroll("Victor");
        ob1.attentCourses("Romana");
        Teachers Marius = new Teachers();
        Marius.giveGrade(ob1, "Alexandru");
        Marius.teachCourses();
        Marius.defineCurricula();
    }
}
