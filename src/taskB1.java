public class taskB1 {
    private String name;
    private String studentId;
    private double gpa;
    private static int studentCount = 0;
    public taskB1(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;

        studentCount++;
    }
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public double getGpa() {
        return gpa;
    }
    public static int getStudentCount() {
        return studentCount;
    }
    public void improveGpa(double delta) {
        if (delta > 0) {
            this.gpa += delta;
        }
    }
    public void printInfo() {
        System.out.println(
                "Студент: " + name +
                        " (ID: " + studentId +
                        "), GPA: " + gpa
        );
    }
    public static void main(String[] args) {
        taskB1 student1 = new taskB1(
                "Абыл",
                "1",
                2.9
        );
        taskB1 student2 = new taskB1(
                "Жансерык",
                "2",
                3.01
        );
        student1.printInfo();
        student2.printInfo();

        System.out.println();

        System.out.println("GPA жақсарғаннан кейін:");

        student1.improveGpa(0.20);

        student1.printInfo();

        System.out.println();

        System.out.println(
                "Студенттер саны: " +
                        taskB1.getStudentCount()
        );
    }
}

