public class taskB2 {

    private String title;
    private String code;
    private int credits;

    private static int courseCount = 0;
    public taskB2(String title, String code, int credits) {
        this.title = title;
        this.code = code;
        this.credits = credits;

        courseCount++;
    }
    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }
    public int getCredits() {
        return credits;
    }
    public static int getCourseCount() {
        return courseCount;
    }
    public void printInfo() {
        System.out.println(
                "Курс: " + title +
                        " (" + code + ")" +
                        ", Кредит: " + credits
        );
    }
    public static void main(String[] args) {

        taskB2 course1 = new taskB2(
                "Java Programming",
                "CS01",
                5
        );

        taskB2 course2 = new taskB2(
                "Mathematics",
                "MATH01",
                4
        );

        course1.printInfo();
        course2.printInfo();

        System.out.println();

        System.out.println(
                "Курстар саны: " +
                        taskB2.getCourseCount()
        );
    }
}

