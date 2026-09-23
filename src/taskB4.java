public class taskB4 {

    public static void main(String[] args) {

        taskB1 s1 = new taskB1("Абыл", "S01", 3.2);
        taskB1 s2 = new taskB1("Жансерык", "S02", 3.0);

        taskB2 c1 = new taskB2("Java Programming", "CS01", 5);
        taskB2 c2 = new taskB2("Databases", "CS02", 4);

        taskB3 e1 = new taskB3(s1, c1);
        taskB3 e2 = new taskB3(s1, c2);
        taskB3 e3 = new taskB3(s2, c1);

        e1.assignGrade(87);
        e2.assignGrade(85);
        e3.assignGrade(84);

        s1.printInfo();
        s2.printInfo();

        c1.printInfo();
        c2.printInfo();

        e1.printSummary();
        e2.printSummary();
        e3.printSummary();

        System.out.println("Курстар саны: " + taskB2.getCourseCount());
        System.out.println("Студенттер саны: " + taskB1.getStudentCount());
    }
}

